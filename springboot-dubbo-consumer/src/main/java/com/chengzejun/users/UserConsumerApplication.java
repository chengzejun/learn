package com.chengzejun.users;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
@DubboComponentScan(basePackages = "com.chengzejun.users.controller")
public class UserConsumerApplication {
    public static void main(String[] args) {

        SpringApplication.run(UserConsumerApplication.class,args);
    }
}
