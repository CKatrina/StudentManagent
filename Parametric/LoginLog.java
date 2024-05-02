package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName("t_login_log")
public class LoginLog implements Serializable{
    private String id;
    @TableField("user_id")
    private String userId;        //UserID
    @TableField("login_time")
    private Date loginTime;       //login time
    @TableField("login_ip")
    private String loginIp;       //login IP
    @TableField("login_total")
    private Integer loginTotal;  //Number of logins
    @TableField(exist = false)
    private String username;     //user name

}
