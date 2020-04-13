package com.chengzejun.user.controller;

import com.chengzejun.user.entity.User;
import com.chengzejun.user.exceptionadvice.ApiExection;
import com.chengzejun.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(value="/user")
@Api(value = "用户接口")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/{id}",method = RequestMethod.GET)
    @ApiOperation(value="根据id获取用户信息",notes = "根据id")
    @ApiImplicitParam(name = "id", value="用户id", required = true, dataType = "Integer",paramType = "path")
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
    @ApiOperation(value="新增用户信息",notes = "新增用户")
    public String save(@RequestBody @Valid User user){
        return userService.save(user);
    }
}
