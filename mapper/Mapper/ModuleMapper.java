package com.management.mapper.Mapper;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.management.Parametric.Module;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface ModuleMapper extends BaseMapper<ModuleMapper>{
    List<Module> getListByPage(Page<Module> page,@Param("name") String name);

    List<Module> getNotSelectedCourse(Page<Module> page, @Param("studentId") String studentId);

    List<Module> getSelectedCourse(Page<Module> page, @Param("studentId") String studentId);

}
