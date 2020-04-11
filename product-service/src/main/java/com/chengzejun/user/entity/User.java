package com.chengzejun.user.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="user")
public class User {

    @Id
    private Long id;

    @NotNull(message = "用户名字不能为空")
    private String name;

    private String userName;

    @NotNull(message = "密码不能为空")
    @Size(min = 3,max = 8,message = "密码必须3-8字符")
    private String password;

    private String idCard;

    private String mobile;


}
