package com.tatana.trisha.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.ws.transport.http.client.HttpClientTransport;
import com.tatana.trisha.dto.User;
import com.tatana.trisha.repository.UserRepository;
import com.vk.api.sdk.client.TransportClient;
import com.vk.api.sdk.client.VkApiClient;
import com.vk.api.sdk.client.actors.UserActor;
import com.vk.api.sdk.httpclient.HttpTransportClient;
import com.vk.api.sdk.objects.UserAuthResponse;
import org.apache.http.HttpHost;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;


@Service
public class DataService {

    private final String token = "fd7f599d2cc70e4b929208835469198b5ab1570d79a1741e10b6b7835ba1075918bdcc9946ed74c472f7a";

    private final String api = "https://api.vk.com/method/groups.getMembers?v=5.52";
    private final String groupId = "ad_spoiler";
    private UserRepository userRepository;

    TransportClient transportClient = HttpClientBuilder.create().setProxy(new HttpHost("88.99.85.194", 6772)).build();
    
    HttpClient client = HttpClients.custom().setProxy(new HttpHost("88.99.85.194", 6772)).build();
    VkApiClient vk = new VkApiClient((TransportClient) client);

    @Autowired
    public DataService(UserRepository userRepository) throws UnknownHostException {
        this.userRepository = userRepository;
    }

    private UserActor actor() {
        try {
            UserAuthResponse authResponse = vk.oauth()
                    .userAuthorizationCodeFlow(7412117, "ZXUiVyR8MsyhVnEtdcPb", "https://2f71c8b1.ngrok.io", "e03a62a617d4689b46")
                    .execute();
            return new UserActor(authResponse.getUserId(), authResponse.getAccessToken());
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<Integer> getUserIdList1() {
        try {
            return vk.groups().getMembers(actor())
                    .groupId(groupId)
                    .offset(0)
                    .execute()
                    .getItems();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<String> getUserIdList() {
        //read json and write to list
        int offset = 0;
        int count = 1;
        List<String> list = new ArrayList<>();
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<String>> typeReference = new TypeReference<List<String>>() {
        };
        try {
            while (offset < count) {
                URL url = new URL(api + "&group_id=" + groupId + "&offset=" + offset + "&access_token=" + token);
                JsonNode jsonNode = objectMapper.readTree(url);
                String items = jsonNode.findValue("items").toString();
                count = jsonNode.findValue("count").asInt();
                offset = offset + 1000;
                list.addAll(objectMapper.readValue(items, typeReference));
                Thread.sleep(500);
            }
            return list;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return list;
        }
    }

    public List<User> getUserInfo(List<String> id) {
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> users = new ArrayList<>();
        TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {
        };
        try {
            for (int i = 0; i < id.size(); i = i + 300) {
                List<String> ids = id.subList(i, i + 299);
                String str = "https://api.vk.com/method/users.get?user_ids=" + ids + "&v=5.52&access_token=" + token;
                URL url = new URL(str.replace("[", "").replace("]", "").replace(" ", ""));
                JsonNode jsonNode = objectMapper.readTree(url);
                String response = jsonNode.findValue("response").toString();
                users.addAll(objectMapper.readValue(response, typeReference));
                Thread.sleep(500);
            }
            return users;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return users;
        }
    }

    public Iterable<User> list() {
        return userRepository.findAll();
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public Iterable<User> save(List<User> users) {
        return userRepository.saveAll(users);
    }


}
