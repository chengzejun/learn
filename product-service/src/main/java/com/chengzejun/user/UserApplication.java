package com.chengzejun.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EntityScan("com.chengzejun.user.entity")
@EnableAspectJAutoProxy
public class UserApplication {

    public static void main(String[] args){
        SpringApplication.run(UserApplication.class,args);
    }
}
