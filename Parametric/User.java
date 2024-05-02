package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
@TableName("User")
public class User implements Serializable{
    private String id;
    private String username;    //username
    private String password;    //password
    private String email;       //email address
    @TableField("photo_url")
    private String photoUrl;    //Avatar address
    private Integer enable;     //is or can use
    @TableField("create_time")
    private Date createTime;    //createtime
    @TableField("last_login_time")
    private Date lastLoginTime; //the last logintime
    @TableField(exist = false)
    private String roleId;      //roleid
    @TableField(exist = false)
    private String roleName;    //rolename
    @TableField(exist = false)
    private List<Authority> userPerms; //permission of user
    @TableField(exist = false)
    private String[] ids;          //delete mults users
    @TableField("First_login")
    private Boolean Firstlogin;  //firstlogin

}