package com.chengzejun.user.controller;

import com.chengzejun.user.entity.User;
import com.chengzejun.user.exceptionadvice.ApiExection;
import com.chengzejun.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    public User findById(@PathVariable Long id){
          User user=new User();
        try {
            user=userService.findById(id);
        } catch (Exception e) {
           throw new ApiExection(10001,"发生异常: "+e.getMessage());
        }
        return user;
    }

    @RequestMapping(value="",method = RequestMethod.POST)
    public String save(@RequestBody @Valid User user){
        return userService.save(user);
    }
}
