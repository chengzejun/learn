package com.chengzejun.users.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.chengzejun.user.entity.User;
import com.chengzejun.user.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@EnableDubbo
@RestController
@RequestMapping("/user")
public class DubboController {

    @Reference(version="1.0.0",timeout = 6000)
    private UserService userService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable Long id){
        return userService.findById(id);
    }
}
