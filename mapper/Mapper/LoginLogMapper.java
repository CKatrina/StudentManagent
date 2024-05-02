package com.management.mapper.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.management.Parametric.LoginLog;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LoginLogMapper extends BaseMapper<LoginLog> {

    /**
     * login_total
     */
    Integer findMaxLoginTotalByUserId(@Param("userId") String userId);

    /**
     * LoginLog，searchKeyWord，username，ip
     */
    List<LoginLog> findUserLoginLogByPage(Pagination page,@Param("searchKeyWord") String searchKeyWord);

    /**
     * login_total
     */
    List<LoginLog> findUserLoginTotal();
}
