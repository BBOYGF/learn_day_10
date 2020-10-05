package com.learn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class controller {
    @RequestMapping("/demo")
    public String test()
    {
        System.out.println("具体执行的方法...");
        return "test";
    }
}
