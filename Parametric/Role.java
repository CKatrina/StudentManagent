package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("Role")
public class Role implements Serializable{
    private String id;
    private String name;       //RoleName
    @TableField("role_desc")
    private String roleDesc;   //RoleDescribe
    @TableField(exist = false)
    private String[] ids;      //Role id to be deleted
}

