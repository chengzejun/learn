package com.chengzejun.user.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="user")
@ApiModel
public class User {

    @Id
    @ApiModelProperty(notes = "ID",required = true)
    private Long id;

    @NotNull(message = "用户名字不能为空")
    @ApiModelProperty(notes = "用户名称",required = true)
    private String name;

    @ApiModelProperty(notes = "用户真实名称",required = true)
    private String userName;

    @NotNull(message = "密码不能为空")
    @Size(min = 3,max = 8,message = "密码必须3-8字符")
    @ApiModelProperty(notes = "用户密码",required = true)
    private String password;

    private String idCard;

    private String mobile;


}
