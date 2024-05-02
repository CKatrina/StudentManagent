package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("role_Auth")
public class RoleAuth implements Serializable{
    private String id;
    @TableField("role_id")
    private String roleId;   //RoleID
    @TableField("perms_id")
    private String permsId;  //Authid
    @TableField(exist = false)
    private String[] permsIds;  //Full permissions for a role

    private String[] ids;    //Permission ID to be deleted
}

