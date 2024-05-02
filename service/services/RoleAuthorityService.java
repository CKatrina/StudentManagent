package com.management.service.services;

import com.baomidou.mybatisplus.service.IService;
import com.management.Parametric.Authority;
import com.management.Parametric.RoleAuth;

import java.util.List;

public interface RoleAuthorityService extends IService<RoleAuth> {

    /**
     * 添加角色权限
     */
    Object addRolesAuth(RoleAuth vo);

    /**
     * 根据角色查询角色权限
     */
    List<RoleAuth> findRolesAuthByRole(String roleId);

    /**
     * 根据角色id查询记录数
     */
    Integer findCountByRole(String roleId, String url);

    /**
     * 根据父id\用户类型查询角色菜单
     */
    List<Authority> findRolesPermisByFatherId(String fatherId, String roleId);
}
