package com.tatana.trisha.controller;

import com.tatana.trisha.provider.UserProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DataController {

    private UserProvider userProvider;

    @Autowired
    public DataController(UserProvider userProvider) {
        this.userProvider = userProvider;
    }

//    @GetMapping("/ids")
//    public Iterable<Integer> idsList() {
//        return userProvider.getUserIdsFromGroup();
//    }
}
