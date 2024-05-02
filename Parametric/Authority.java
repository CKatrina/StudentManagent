package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.List;


@Data
@TableName("t_perms")
public class Authority implements Serializable{
    private String id;
    private String name;      //authority name
    private String url;       //authority address
    @TableField("parent_id")
    private String parentId;  //Parent Permission id
    private Integer type;     //Type of authority
    private Integer sort;     //authority sorting number
    @TableField(exist = false)
    private List<Authority> children; //subpermission
    @TableField(exist = false)
    private String lastPermis; //Parent menu name
    @TableField(exist = false)
    private String[] ids;     //Permission id to be deleted
}
