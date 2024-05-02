package com.management.mapper.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.management.Parametric.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface StudentMapper extends BaseMapper<StudentMapper>{
    List<Student> getListByPage(Page<Student> page, @Param("name") String name);
    Integer getStudentCount(@Param("programmeId") String majorId);
}
