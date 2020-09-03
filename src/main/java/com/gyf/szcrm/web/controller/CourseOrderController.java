package com.gyf.szcrm.web.controller;

import com.gyf.szcrm.model.CURDResult;
import com.gyf.szcrm.model.CourseOrder;
import com.gyf.szcrm.model.PageResult;
import com.gyf.szcrm.service.ICourseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    /*
    page 显示的当前页
    limit 每次显示多少条
     */
    public PageResult<CourseOrder>listJson(CourseOrder condition,int page,int limit){
        System.out.println(condition);
        PageResult<CourseOrder> result = orderService.findPageResult(condition,page,limit);

        return result;
    }

    @RequestMapping("/add")
    public String add(){

        return "courseorder/add";
    }
    @RequestMapping("/detail")
    public String detail(Model model,String order_id){
        CourseOrder order=orderService.finByOrderId(order_id);
        model.addAttribute("order",order);
        return "courseorder/detail";
    }

    @RequestMapping("/delete")
    @ResponseBody
    public CURDResult delete(String order_id){
        CURDResult result = new CURDResult();
        orderService.deleteByOrderId(order_id);
        return result;
    }


    @RequestMapping("edit")

    public String edit(Model model,String order_id){
        System.out.println("修改订单order_id"+order_id);
        CourseOrder order=orderService.finByOrderId(order_id);
        model.addAttribute("order",order);
        return "courseorder/edit";
    }
    @RequestMapping("/save")
    @ResponseBody
    public CURDResult save(CourseOrder order){
        CURDResult result=new CURDResult();
        if(order.getOrder_id()==null||order.getOrder_id().length()==0){
            orderService.save(order);

        }else {
            orderService.update(order);
        }
        System.out.println(order);
        return result;

    }
}
