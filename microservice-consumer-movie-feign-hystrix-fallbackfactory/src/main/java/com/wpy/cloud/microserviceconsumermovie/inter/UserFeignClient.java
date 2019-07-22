package com.wpy.cloud.microserviceconsumermovie.inter;

import com.wpy.cloud.microserviceconsumermovie.pojo.User;
import feign.hystrix.FallbackFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@FeignClient(name = "microservice-provider-user", fallbackFactory = UserFeignClient.FeignClientFallbackFactory.class)
public interface UserFeignClient {

    @GetMapping("/{id}")
    User findById(@PathVariable("id") Long id);

    @GetMapping("/get")
    User get1(@RequestParam("id") Long id, @RequestParam("username") String username);

    @GetMapping("/get2")
    User get2(@RequestParam Map<String, Object> map);

    @PostMapping("/post")
    User post(@RequestBody User user);

    @Component
    class FeignClientFallbackFactory implements FallbackFactory<UserFeignClient> {
        private Logger logger = LoggerFactory.getLogger(UserFeignClient.class);

        @Override
        public UserFeignClient create(Throwable throwable) {
            return new UserFeignClient() {
                @Override
                public User findById(Long id) {
                    logger.info("fallback error：", throwable);
                    User user = new User();
                    user.setId(-1L);
                    user.setName("默认用户");
                    return user;
                }

                @Override
                public User get1(Long id, String username) {
                    return null;
                }

                @Override
                public User get2(Map<String, Object> map) {
                    return null;
                }

                @Override
                public User post(User user) {
                    return null;
                }
            };
        }
    }
}
