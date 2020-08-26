package com.gyf.szcrm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @RequestMapping("/index")
    public String index(){
        System.out.println("修改");
        return "index";
    }
}
