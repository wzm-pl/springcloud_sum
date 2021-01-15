package com.jk.model;

import lombok.Data;

@Data
public class WemediaBean {

    private Integer mediaId;

    private String mediaName;

    private Integer mediaType;

    private Integer classifyId;

    private String code;

    private Integer applyId;

    private String portUrl;

    private Integer accreditType;

    private String onlineDate;

    private String apiStatus;

    private String mediaUnits;

    private String mediaInfo;

    private Double elePrice;

    private Double boElePrice;

    private String readableTime;

    private String contractDate;

    //临时字段  所属分类
    private String classifyName;
    //临时字段  应用产品类型
    private String applyName;
}
