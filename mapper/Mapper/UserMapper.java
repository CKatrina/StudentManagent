package com.management.mapper.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.management.Parametric.User;

import java.util.List;


public interface UserMapper extends BaseMapper<User>{
    //paging search
    List<User> findUserByPage(Pagination page,User user);

    //login verification
    List<User> checkUser(User user);

    User findUserByUsername(String username);

    //unpaged query
    List<User> findAllUser(User user);
}
