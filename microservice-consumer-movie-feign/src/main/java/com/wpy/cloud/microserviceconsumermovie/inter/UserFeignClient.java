package com.wpy.cloud.microserviceconsumermovie.inter;

import com.wpy.cloud.microserviceconsumermovie.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);
}
