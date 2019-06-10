package com.wpy.cloud.microservicesimpleprovideruser.controller;

import com.wpy.cloud.microservicesimpleprovideruser.dao.UserRepository;
import com.wpy.cloud.microservicesimpleprovideruser.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRepository.findById(id).get();
        return user;
    }
}
