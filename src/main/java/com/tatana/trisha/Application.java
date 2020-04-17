package com.tatana.trisha;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tatana.trisha.dto.User;
import com.tatana.trisha.service.DataService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    CommandLineRunner runner(DataService dataService){
//        return args -> {
//            //read json and write to db
//            ObjectMapper objectMapper = new ObjectMapper();
//            TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {};
//            InputStream inputStream = TypeReference.class.getResourceAsStream("");
//            try{
//                List<User> users = objectMapper.readValue(inputStream, typeReference);
//                dataService.save(users);
//                System.out.println("user saved");
//            }
//            catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//        };
//    }

}

