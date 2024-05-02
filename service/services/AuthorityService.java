package com.management.service.services;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.management.Parametric.Authority;

import java.util.List;
import java.util.Map;


public interface AuthorityService extends IService<Authority> {
    List<Authority> loadUserResources(Map map);
    /**
     * @desc: 查询菜单
     */
    List<Authority> findPermissionByPage(Page<Authority> page, String permsName);

    /**
     * @desc: 新增菜单
     */
    Object addPermissions(Authority vo);

    /**
     * @desc: 删除菜单
     */
    Object delPermis(String[] ids);

    /**
     * @desc: 根据菜单查询菜单
     */
    List<Authority> findPermissionByName(String name);

    /**
     * @desc: 根据父级id查询上级菜单
     */
    List<Authority> findLastPermissionByType(String type);

    /**
     * @desc: 查询所有父级菜单绑定树形
     */
    List<Authority> findBasePermission();

    /**
     * 根据url查询记录
     */
    Integer findCountByUrl(String requestUrl);
}
