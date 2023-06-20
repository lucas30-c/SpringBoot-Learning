package com.finn.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody //因爲返回的語句要以字符串的方式寫給瀏覽器。代表返回的數據直接給瀏覽器。

@RestController //是以上兩個注解的合體。
public class HelloController {

    @RequestMapping("/hello")
    public String handle01() {
        return "Hello, SpringBoot!";
    }
}
