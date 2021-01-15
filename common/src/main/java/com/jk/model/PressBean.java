package com.jk.model;

import lombok.Data;

@Data
public class PressBean {

    private Integer pressId;        //资源级别
    private Integer journalType;    //期刊类型
    private String pressName;       //出版社名称
    private String editor;  //主编
    private String slogan;  //口号
    private String intro;   //简介
    private String resourceLevel;   //资源级别

    private Integer qkid;   //期刊id
}
