package com.management.mapper.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.management.Parametric.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleMapper extends BaseMapper<Role> {

    /**
     * @desc: Query Role
     */
    List<Role> findRoleByPage(Pagination page, @Param("roleName") String roleName);

    /**
     * Bind Role drop-down box
     */
    List<Role> findAllRoles();
}
