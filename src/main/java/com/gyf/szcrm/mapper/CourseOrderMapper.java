package com.gyf.szcrm.mapper;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.MonthIncome;

import java.util.List;
import java.util.Map;

public interface CourseOrderMapper {
    public int findCountByMap(Map<String,Object>map);
    public List<CourseOrder> findListByMap(Map<String,Object>map);


    public void insert(CourseOrder order);

    public CourseOrder finByOrderId(String order_id);

    public void deleteByOrderId(String order_id);

    public void update(CourseOrder order);

    public List<MonthIncome> getMonthIncomes();
}
