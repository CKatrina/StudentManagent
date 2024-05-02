package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("user_role")
public class UserRole implements Serializable{
    private String id;
    @TableField("user_id")
    private String userId;   //userid
    @TableField("role_id")
    private String roleId;   //roleid
}
