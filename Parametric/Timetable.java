package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;


@Data
@TableName("student_course")
public class Timetable implements Serializable{
    private String id;
    @TableField("timetable_ID")
    private String timetable_ID;   //timetable_ID
    @TableField("module_ID")
    private String module_ID;    //module_ID
    @TableField(exist = false)
    private String student_ID;   //student_ID
    @TableField("Teacher_ID")
    private String Teacher_ID;   //Teacher_ID
    @TableField("day_of_week")
    private Enum day_of_week;   //What day of the week is the class?
    @TableField("module_start_day")
    private Date module_start_day;    //module_start_day
    @TableField("module_end_day")
    private Date module_end_day;      //module_end_day
    @TableField("module_start_time")
    private Time module_start_time;   //module_start_time
    @TableField("module_end_time")
    private Time module_end_time;     //module_end_time
}