package com.gyf.szcrm.mapper;

import com.gyf.szcrm.model.CourseOrder;

import java.util.List;
import java.util.Map;

public interface CourseOrderMapper {
    public int findCountByMap(Map<String,Object>map);
    public List<CourseOrder> findListByMap(Map<String,Object>map);


}