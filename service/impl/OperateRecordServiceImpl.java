package com.management.service.impl;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.management.mapper.Mapper.OperateRecordMapper;
import com.management.Parametric.OperateRecord;
import com.management.service.services.OperateRecordService;
import com.management.utils.EnumCode;
import com.management.utils.ResultUtil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class OperateRecordServiceImpl extends ServiceImpl<OperateRecordMapper, OperateRecord> implements OperateRecordService {

    /**
     * Query operation record
     */
    public List<OperateRecord> findOperatingRecordByPage(Page<OperateRecord> page, String searchKeyWord){
        return super.baseMapper.findOperateRecordByPage(page,searchKeyWord);
    }

    /**
     * Access statistics
     */
    public Object findUserReqTotal() {
        List<OperateRecord> reqList = super.baseMapper.findAllRequstCount();
        List<Map<String,Object>> reqData1 = new ArrayList<>();
        List<Map<String,Object>> reqData2 = new ArrayList<>();
        String[] arrNa = new String[reqList.size()];
        for (int i = 0, j = reqList.size(); i < j; i++) {
            if (reqList.get(i).getType().equals(1)) {
                // 有请求方法
                Map<String,Object> map = new HashMap<>();
                map.put("name",reqList.get(i).getMethod());
                map.put("value",reqList.get(i).getTotal());
                reqData1.add(map);
            } else {
                // 没有查到请求方法
                Map<String,Object> map = new HashMap<>();
                map.put("name",reqList.get(i).getMethod());
                map.put("value",reqList.get(i).getTotal());
                reqData2.add(map);
            }
            arrNa[i] = reqList.get(i).getMethod();
        }
        Map<String,Object> map = new HashMap<>();
        map.put("methodList",reqData1);
        map.put("userList",reqData2);
        map.put("arrName",arrNa);

        return ResultUtil.result(EnumCode.OK.getValue(), EnumCode.OK.getText(), map);
    }
}