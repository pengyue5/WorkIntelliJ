package com.wpy.cloud.microserviceprovideruser.controller;

import com.wpy.cloud.microserviceprovideruser.dao.UserRepository;
import com.wpy.cloud.microserviceprovideruser.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {
        User user = this.userRepository.findById(id).get();
        return user;
    }

    @GetMapping("/get")
    public User get1(@RequestParam("id") Long id, @RequestParam("username") String username) {
        User user = this.userRepository.findById(id).get();
        return user;
    }

    @GetMapping("/get2")
    public User get2(@RequestParam String username, @RequestParam String password) {
        User user = new User();
        user.setUsername(username);
        user.setName(password);
        return user;
    }

    @PostMapping("/post")
    public User post(@RequestBody User user) {
        user = this.userRepository.save(user);
        return user;
    }
}
