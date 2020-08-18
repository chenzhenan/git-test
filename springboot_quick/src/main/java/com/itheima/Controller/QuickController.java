package com.itheima.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class QuickController {


    @RequestMapping("/quick")
    @ResponseBody
    public String quick(){

        return "hello Springboot!!!chenzhenan";
    }

}
