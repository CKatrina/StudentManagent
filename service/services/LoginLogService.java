package com.management.service.services;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.management.Parametric.LoginLog;

import java.util.List;

public interface LoginLogService extends IService<LoginLog> {

    /**
     * Enquiry Login Number
     */
    Integer findMaxLoginTotalByUserId(String userId);


    /**
     * User Login Log
     */
    List<LoginLog> findUserLoginLogByPage(Page<LoginLog> page, String searchKeyWord);

    /**
     * Statistical Landing
     */
    Object findUserLoginTotal();
}
