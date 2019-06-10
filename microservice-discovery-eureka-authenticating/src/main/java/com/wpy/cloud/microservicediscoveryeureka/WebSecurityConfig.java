package com.wpy.cloud.microservicediscoveryeureka;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        /**
         * http 403 我们可以把问题定位到请求被禁止，原因是由于新版的Spring security 会默认开启防csrf攻击，
         * 所有的请求都必须携带crsf这个参数，但是从以上的信息来看显然是没有的。
         * 所以我们需要主动去关闭，在Eureka服务配置
         */
        http.csrf().disable();
        super.configure(http);
    }
}