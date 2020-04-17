package com.tatana.trisha.controller;

import com.tatana.trisha.dto.User;
import com.tatana.trisha.service.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class DataController {


    private DataService dataService;

    public DataController(DataService dataService) {
        this.dataService = dataService;
    }

    @GetMapping("/ids")
    public Iterable<Integer> idsList() {
        return dataService.getUserIdList1();
    }

    @GetMapping("/users")
    public Iterable<User> usersList() {
        return dataService.getUserInfo( dataService.getUserIdList());
    }
}
