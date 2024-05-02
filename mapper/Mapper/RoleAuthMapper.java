package com.management.mapper.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.management.Parametric.Authority;
import com.management.Parametric.RoleAuth;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleAuthMapper extends BaseMapper<RoleAuth> {

    /**
     * Querying Role Permissions by Role
     */
    List<RoleAuth> findRolesPermisByRole(@Param("roleId") String roleId);

    /**
     * Query the number of records according to the role id
     */
    Integer findCountByRole(@Param("roleId") String roleId, @Param("url") String url);

    /**
     * Query role menu by parent id\role id
     */
    List<Authority> findRolesPermisByFatherId(@Param("parentId") String parentId, @Param("roleId") String roleId);
}