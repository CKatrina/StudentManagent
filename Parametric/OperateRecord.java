package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;


@Data
@TableName("t_operate_record")
public class OperateRecord implements Serializable{
    private String id;
    @TableField("request_url")
    private String requestUrl;      //Request url
    @TableField("remote_addr")
    private String remoteAddr;      //request IP
    private String params;          //request parametric
    private String method;          //request method
    @TableField("create_time")
    private Date createTime;        //request time
    @TableField("user_id")
    private String userId;          //user id
    @TableField("is_success")
    private Integer isSuccess;      //request issuccess
    @TableField(exist = false)
    private String permName;        //parametric name
    @TableField(exist = false)
    private String username;        //usename
    @TableField(exist = false)
    private Integer total;          //request total
    @TableField(exist = false)
    private Integer type;          //request type
}
