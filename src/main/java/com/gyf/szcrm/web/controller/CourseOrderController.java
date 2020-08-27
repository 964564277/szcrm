package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.PageResult;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequestMapping("/courseorder")
public class CourseOrderController {
    @Autowired
    ICourseOrderService orderService;
    @RequestMapping("/list")
    public String list(){

        return "courseorder/list";
    }
    @RequestMapping("listJson")
    @ResponseBody
    public PageResult<CourseOrder>listJson(){
        PageResult<CourseOrder> result = orderService.findPageResult(null,1,8);

        return result;
    }
}
