package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("programme")
public class Meeting implements Serializable{
    private String id;
    private String name;          //Programmes Name
    @TableField("Programme_ID")
    private String Programme_ID;   //Programme ID
    @TableField("Describe")
    private String[] ids;            //id collection
}
