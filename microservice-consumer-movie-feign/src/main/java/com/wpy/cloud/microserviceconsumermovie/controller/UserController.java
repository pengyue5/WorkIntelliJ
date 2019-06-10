package com.wpy.cloud.microserviceconsumermovie.controller;

import com.wpy.cloud.microserviceconsumermovie.inter.UserFeignClient;
import com.wpy.cloud.microserviceconsumermovie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }
}
