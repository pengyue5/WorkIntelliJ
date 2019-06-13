package com.wpy.cloud.microserviceconsumermovie.inter;

import com.wpy.cloud.microserviceconsumermovie.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);

    @GetMapping("/get")
    User get1(@RequestParam("id") Long id, @RequestParam("username") String username);

    @GetMapping("/get2")
    User get2(@RequestParam Map<String, Object> map);

    @PostMapping("/post")
    User post(@RequestBody User user);
}
