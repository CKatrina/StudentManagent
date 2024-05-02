package com.management.service.services;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.management.Parametric.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;


public interface UserService extends IService<User>{

    //unpaged query
    List<User> findAllUser(User user);

    /**
     * Search for users by user name
     */
    User findUserByUsername(String username);

    /**
     * Login
     */
    Object login(User user, HttpSession session, HttpServletRequest request);

    /**
     * @desc: new subscriber
     */
    Object addUser(User user);


    /**
     * @desc: user search
     */
    List<User> findUserByPage(Page<User> page, User user);

    /**
     * @desc: Batch Delete Users
     */
    Object delUsers(String[] ids);

    /**
     * @desc: login authentication
     */
    List<User> checkUser(User user);

    /**
     * Modify user status
     */
    Object editUserStatus(User user);

    /**
     * Modification of User's Personal Information by the User
     */
    Object editUserInfo(User user);
}
