package com.tatana.trisha.provider;

import com.tatana.trisha.service.UserService;
import com.tatana.trisha.utils.Mapper;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.exceptions.ApiException;
import com.vk.api.sdk.exceptions.ClientException;
import com.vk.api.sdk.queries.users.UserField;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
//@PropertySource("classpath:vk.properties")
public class UserProvider {

    private static final Logger LOGGER = LogManager.getLogger(UserProvider.class);

    @Value("${vk.api.groupId}")
    private String groupId;

    private final VkApiClient vkApiClient;
    private final UserActor userActor;
    private final UserService userService;

    @Autowired
    public UserProvider(VkApiClient vkApiClient, UserActor userActor, UserService userService) {
        this.vkApiClient = vkApiClient;
        this.userActor = userActor;
        this.userService = userService;
    }

    List<Integer> idsFormKafka = new ArrayList<>();

    @KafkaListener(topics = "userID", groupId = "trisha")
    public void listen(Integer message) {
        idsFormKafka.add(message);
        if (idsFormKafka.size()==1000){
            getGroupUsers(idsFormKafka);
            idsFormKafka.clear();
        }
        LOGGER.info("Received Messasge in group trisha: " + message + " ids size " + idsFormKafka.size());
    }


    public void getGroupUsers(List<Integer> userIds) {
        try {
            vkApiClient.users().get(userActor)
                    .userIds(String.valueOf(userIds))
                    .fields(UserField.values())
                    .execute()
                    .stream()
                    .map(Mapper::userFullToUserEntity)
                    .forEach(userService::save);
        } catch (ApiException e) {
            e.printStackTrace();
            LOGGER.info("ApiExeption: " + e.getMessage());
        } catch (ClientException e) {
            e.printStackTrace();
            LOGGER.info("ClientException: " + e.getMessage());
        }
    }

}
