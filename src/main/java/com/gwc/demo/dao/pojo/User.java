package com.gwc.demo.dao.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class User {
    /** */
    private Long id;

    /** 用户名字*/
    private String name;

    /** 年龄*/
    private Integer age;

    /** 性别 0默认1男2女*/
    private Integer sex;

    /** */
    private String cellPhone;

    /** */
    private Date createTime;

    /** */
    private Date updateTime;
}