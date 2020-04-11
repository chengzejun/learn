package com.chengzejun.user.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity
@Table(name="user")
public class User implements Serializable {

    @Id
    private Long id;

    private String name;

    private String userName;

    private String password;

    private String idCard;

    private String mobile;


}
