package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;


@Data
@TableName("t_grade")
public class Grade implements Serializable{
    private String id;
    @TableField("student_id")
    private String studentId;   //studentID
    @TableField("course_id")
    private String moduleId;    //courseID
    @TableField("teacher_id")
    private String teacherId;   //teacherid
    @TableField("exam_type")
    private Integer examType;   //type of grade: exam or paper
    @TableField("exam")
    private Double score;       //Score
    private String remark;     //teacher assessment
    @TableField(exist = false)
    private String studentName; //studentname
    @TableField(exist = false)
    private String[] ids;            //id
    @TableField(exist = false)
    private DateTime grade_time;     //Paper submission time

}
