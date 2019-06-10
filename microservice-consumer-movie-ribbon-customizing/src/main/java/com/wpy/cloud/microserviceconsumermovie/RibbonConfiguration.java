package com.wpy.cloud.microserviceconsumermovie;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Ribbon的配置类
 * 注意：该类不应该在主应用程序上下文的@ComponentScan所扫描的包中
 */
@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribboRule() {
        //负载均衡规则，改为随机
        return new RandomRule();
    }
}
