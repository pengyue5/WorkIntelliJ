package com.wpy.cloud.microserviceconsumermovie.inter;

import com.wpy.cloud.microserviceconsumermovie.config.FeignConfiguration;
import com.wpy.cloud.microserviceconsumermovie.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//@FeignClient(name = "microservice-provider-user", configuration = FeignConfiguration.class)
@FeignClient(name = "microservice-provider-user")
public interface UserFeignClient {

    //@GetMapping("/{id}")
    //User findById(@PathVariable("id") Long id);

    @RequestLine("GET /{id}")
    User findById(@Param("id") Long id);
}
