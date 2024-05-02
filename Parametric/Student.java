package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("t_student")
public class Student implements Serializable{
    private String id;
    private String name;             //Student Name

    @TableField("student_number")
    private String studentNumber;    //Student Number
    private Integer sex;             //Student gender
    private String phone;            //Student phone number

    @TableField("photo_url")
    private String photoUrl;         //Avatar address

    @TableField("email")
    private String email;            //email

    @TableField("major_id")
    private String majorId;          //Majorid

    @TableField(exist = false)
    private String majorName;        //Majorname

    @TableField(exist = false)
    private String[] ids;            //id collection
}
