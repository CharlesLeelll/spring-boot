package com.lee.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Charles
 * @Date: 2019.1.19
 * @Desc:
 */
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Greeting from Spring Boot !";
    }
}
