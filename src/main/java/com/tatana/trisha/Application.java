package com.tatana.trisha;

import com.tatana.trisha.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    private final UserProvider userProvider;


    @Autowired
    public Application(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
//
//    @Bean
//    public CommandLineRunner collectData() {
//        return collectData -> userProvider.getGroupUsers();
//    }

}

