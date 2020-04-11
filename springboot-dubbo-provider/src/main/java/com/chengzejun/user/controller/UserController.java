package com.chengzejun.user.controller;

import com.chengzejun.user.entity.User;
import com.chengzejun.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value="/user")
public class UserController {
//    @Autowired
//    private UserService userService;
//
//    @RequestMapping(value="/{id}",method = RequestMethod.GET)
//    public User findById(@PathVariable Long id){
//        return userService.findById(id);
//    }
//
//    @RequestMapping(value="",method = RequestMethod.POST)
//    public User save(@RequestBody User user){
//        userService.save(user);
//        return user;
//    }
}
