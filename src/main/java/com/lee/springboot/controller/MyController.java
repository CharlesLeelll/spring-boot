package com.lee.springboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Charles
 * @Date: 2019.1.19
 * @Desc:
 */
@RestController
public class MyController {

    @Value("${my.name}")
    private String name;

    @Value("${my.age}")
    private String age;

    @RequestMapping(value = "/my")
    public String My() {
        return name + "\t" + age;
    }
}
