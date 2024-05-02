package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;


@Data
@TableName("absence")
public class Absence implements Serializable{
    private String id;
    private String absence_id;          //absence_id
    @TableField("absence_desc")
    private String absence_desc;   // Leave of Absence Description
    @TableField("student_id")
    private String student_id;            //student_id
    @TableField("teacher_id")
    private String teacher_id;          //teacher_id
    @TableField("timetable_id")         //A lesson id in a separate timetable
    private String timetable_id;
    @TableField("absence_status")
    private int absence_status;       //Approval status: 0 pending 1 approved 2 rejected
}
