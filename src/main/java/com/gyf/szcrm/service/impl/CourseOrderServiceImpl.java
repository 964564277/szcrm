package com.gyf.szcrm.service.impl;

import com.gyf.szcrm.mapper.CourseOrderMapper;
import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.MonthIncome;
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
    public PageResult<CourseOrder> findPageResult(CourseOrder condition, int page, int pageSize) {
        PageResult<CourseOrder> result = new PageResult<>();
        result.setCode(0);
        //查询参数先设置为空

        Map<String, Object> params = new HashMap<>();
        params.put("condition",condition);//模糊查询
        params.put("start",(page-1)*pageSize);
        params.put("pageSize",pageSize);
        //获取总记录数
        int totalCount=orderMapper.findCountByMap(params);
        result.setCount(totalCount);
        List<CourseOrder>list=orderMapper.findListByMap(params);
        result.setData(list);
        return result;
    }

    @Override
    public void save(CourseOrder order) {
        orderMapper.insert(order);

    }

    @Override
    public CourseOrder finByOrderId(String order_id) {
        return orderMapper.finByOrderId(order_id);
    }

    @Override
    public void deleteByOrderId(String order_id) {
        orderMapper.deleteByOrderId(order_id);
    }

    @Override
    public void update(CourseOrder order) {
        orderMapper.update(order);
    }

    @Override
    public List<MonthIncome> getMonthIncomes() {
        return orderMapper.getMonthIncomes();
    }
}
