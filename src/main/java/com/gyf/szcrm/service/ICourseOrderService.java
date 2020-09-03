package com.gyf.szcrm.service;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.MonthIncome;
import com.gyf.szcrm.model.PageResult;

import java.util.List;

public interface ICourseOrderService {
    public PageResult<CourseOrder> findPageResult(CourseOrder courseOrder,int page,int pageSize);

    public void save(CourseOrder order);

    public CourseOrder finByOrderId(String order_id);


    public void deleteByOrderId(String order_id);

    public void update(CourseOrder order);

    public List<MonthIncome> getMonthIncomes();
}
