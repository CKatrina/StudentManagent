package com.management.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.management.mapper.Mapper.LoginLogMapper;
import com.management.Parametric.LoginLog;
import com.management.service.services.LoginLogService;
import com.management.utils.EnumCode;
import com.management.utils.ResultUtil;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginlogServiceImpl extends ServiceImpl<LoginLogMapper, LoginLog> implements LoginLogService {
    /**
     * :: Querying the number of logins
     */
    public Integer findMaxLoginTotalByUserId(String usrId) {

        return super.baseMapper.findMaxLoginTotalByUserId(usrId);
    }

    /**
     * User login log
     */
    public List<LoginLog> findUserLoginLogByPage(Page<LoginLog> page, String searchKeyWord) {
        return super.baseMapper.findUserLoginLogByPage(page, searchKeyWord);
    }

    /**
     * :: Statistical log-in
     */
    public Object findUserLoginTotal() {

        List<LoginLog> loignList = super.baseMapper.findUserLoginTotal();
        String[] strName = new String[loignList.size()];
        int[] itotal = new int[loignList.size()];
        for (int i = 0, j = loignList.size(); i < j; i++) {
            strName[i] = loignList.get(i).getUsername();
            itotal[i] = loignList.get(i).getLoginTotal();
        }
        Map<String,Object> map = new HashMap<>();
        map.put("name",strName);
        map.put("total",itotal);
        return ResultUtil.result(EnumCode.OK.getValue(), EnumCode.OK.getText(), map);
    }
}
