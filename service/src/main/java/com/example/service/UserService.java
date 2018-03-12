package com.example.service;

import com.example.entity.User;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;

@EnableEurekaClient
public interface UserService {
    @RequestMapping(value = "queryUserById")
    User queryUserById(Integer userId);
}
