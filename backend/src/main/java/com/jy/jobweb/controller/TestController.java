package com.jy.jobweb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/test")
@RestController
public class TestController {

    @GetMapping("test")
    public String test(){
        return "test";
    }

    @GetMapping("test2")
    public String test2(){
        return "test2";
    }

}
