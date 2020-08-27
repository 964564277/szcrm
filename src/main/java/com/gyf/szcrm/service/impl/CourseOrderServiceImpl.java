package com.gyf.szcrm.service.impl;

import com.gyf.szcrm.mapper.CourseOrderMapper;
import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.PageResult;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CourseOrderServiceImpl implements ICourseOrderService {
    @Autowired
    CourseOrderMapper orderMapper;
    @Override
    public PageResult<CourseOrder> findPageResult(CourseOrder courseOrder, int page, int pageSize) {
        PageResult<CourseOrder> result = new PageResult<>();
        result.setCode(0);
        Map<String, Object> params = new HashMap<>();
        //获取总记录数
        int totalCount=orderMapper.findCountByMap(params);
        result.setCount(totalCount);
        List<CourseOrder>list=orderMapper.findListByMap(params);
        result.setData(list);
        return result;
    }
}
