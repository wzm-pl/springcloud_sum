package com.jk.model;

import lombok.Data;

@Data
public class UserBean {

    private Integer userId;

    private Integer aid;   //管理员id

    private String userName;

    private String userImg;

    private Integer userStatus;  //状态 1：启用 2：未启用

    private String password;

    private String phone;

    private String mailbox;

    private String area;

    private String site;  //地区

    private Integer pertypeId;  //期刊类型
}
