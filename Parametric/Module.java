package com.management.Parametric;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import org.joda.time.DateTime;

import java.io.Serializable;


@Data
@TableName("module")
public class Module implements Serializable{
    private String id;
    private String name;         //course name
    @TableField(exist = false)
    private Double credit;       //credits(学分)
    @TableField(exist = false)
    private Double module_file;   //module file
    @TableField("sign_stime")
    private DateTime signStime;    //Enrolment start time
    @TableField("sign_etime")
    private DateTime signEtime;    //Enrolment end Time
    @TableField("exam_stime")
    private DateTime examStime;    //Examination&task(report) start time
    @TableField("exam_etime")
    private DateTime examEtime;   //Examination&task(report) end time
    @TableField(exist = false)
    private String teachersName;   //Teacher of the class, there may be more than one
    @TableField(exist = false)
    private Integer studentNum;    //Number of electors
    @TableField(exist = false)
    private String[] teacherIds;   //Teacher id
    @TableField(exist = false)
    private String[] ids;          //A collection of ids, either from the course or from the course-teacher intermediate table.
    @TableField(exist = false)
    private Integer status;      //Did the teacher enter a grade: 1 yes, 0 no
    @TableField(exist = false)
    private String isCanDelete;  //Is it possible to unsubscribe from a selected course
}