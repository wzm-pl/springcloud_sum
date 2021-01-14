package com.jk.model;

import lombok.Data;

@Data
public class PeriodicalBean {  //期刊表

    private Integer periodicalId;

    private String periodicalName;

    private String periodicalCode;  //代号

    private String periodicalNews;

    private Integer periodicalStatus;  //OA上线状态

    private String launchDate;   //OA上线日期

    private String tagName;   //标签名称

    private Integer copyright;  //版权状态

    private Double price;

    private Integer source;   //来源状态

    private Integer moduleType;   //模块类型

    private Integer readPages;  //试读页数

    private Integer tid;   //期刊类型id

    private Integer userId;   //管理员id
}
