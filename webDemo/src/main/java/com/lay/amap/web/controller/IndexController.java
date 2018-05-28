package com.lay.amap.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author yalei.chen
 * @date 2018/5/28
 * @since JDK 1.8
 */
@Controller
public class IndexController {

    @GetMapping("/index")
    public String create() {
        return "index";
    }

    @GetMapping("/hello")
    public String hello() {
        return "helloWorld";
    }

    @GetMapping("/marker")
    public String marker() {
        return "marker";
    }

    @GetMapping("/cruise")
    public String cruise() {
        return "cruise";
    }
}
