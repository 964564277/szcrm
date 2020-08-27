package com.gyf.szcrm.service;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.PageResult;

public interface ICourseOrderService {
    public PageResult<CourseOrder> findPageResult(CourseOrder courseOrder,int page,int pageSize);

}
