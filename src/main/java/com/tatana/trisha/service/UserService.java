package com.tatana.trisha.service;


import com.tatana.trisha.dto.UserEntity;
import com.tatana.trisha.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Iterable<UserEntity> list() {
        return userRepository.findAll();
    }

    public UserEntity save(UserEntity user) {
        return userRepository.save(user);
    }

    public Iterable<UserEntity> save(List<UserEntity> users) {
        return userRepository.saveAll(users);
    }

}
