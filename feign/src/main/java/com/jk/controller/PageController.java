package com.jk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {


    @RequestMapping("toPeriodsPage")
    public String toPeriodsPage(){
        return "periods";
    }

    @RequestMapping("toIndex")
    public String toIndex(){
        return "index";
    }

    @RequestMapping("toMain")
    public String toMain(){
        return "main";
    }
}
