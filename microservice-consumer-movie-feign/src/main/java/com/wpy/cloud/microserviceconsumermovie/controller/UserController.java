package com.wpy.cloud.microserviceconsumermovie.controller;

import com.wpy.cloud.microserviceconsumermovie.inter.UserFeignClient;
import com.wpy.cloud.microserviceconsumermovie.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class UserController {
    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Long id) {
        return this.userFeignClient.findById(id);
    }

    @GetMapping("/user/get")
    public User get1(@RequestParam Long id, @RequestParam String username) {
        return this.userFeignClient.get1(id, username);
    }

    @GetMapping("/user/get2")
    public User get2(@RequestParam String username, @RequestParam String password) {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("username", username);
        map.put("password", password);
        map.put("id", 123);
        return this.userFeignClient.get2(map);
    }

    @PostMapping("/user/post")
    public User post(@RequestBody User user) {
        return this.userFeignClient.post(user);
    }
}
