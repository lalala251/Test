package com.project.property.entity;

import java.io.Serializable;
import lombok.Data;


@Data
public class User implements Serializable {
    /**
    * 自增主键
    */
    private Integer id;

    /**
    * 用户姓名
    */
    private String userName;

    /**
    * 电话
    */
    private String phone;

    /**
    * 身份证号
    */
    private String cardNum;

    /**
    * 性别
    */
    private String sex;

    /**
    * 民族
    */
    private String nation;

    /**
    * 户籍地址
    */
    private String registerAddress;

    /**
     * 健康码 红 黄 绿
     */
    private String healthFlag;

    /**
     * 疫苗：未接种 或者 二针  三针
     */
    private String vaccines;

    /**
     * 是否居家隔离 0否 1是
     */
    private String quarantineFlag;

    /**
     * 行程码，多个城市逗号隔开
     */
    private String trip;

    /**
     * 邮箱地址
     */
    private String email;

    private static final long serialVersionUID = 1L;
}