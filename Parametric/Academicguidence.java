package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;


@Data
@TableName("academic_guidence")
public class Academicguidence implements Serializable{
    private int id;
    private String academic_id;          //academic_id
    @TableField("student_id")
    private String student_id;   //student_id
    @TableField("teacher_id")
    private String teacher_id;            //teacher_id
    @TableField("application_deadline")
    private DateTime application_deadline;  //application_deadline
    @TableField("tutor_status")
    private int tutor_status;    //Approval or not
    @TableField("content")
    private String content;        //content
}
