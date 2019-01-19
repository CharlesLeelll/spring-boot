package com.lee.springboot.controller;

import com.lee.springboot.bean.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Charles
 * @Date: 2019.1.19
 * @Desc:
 */
@RestController
@EnableConfigurationProperties
public class BeanController {

    @Autowired
    ConfigBean configBean;

    @RequestMapping(value = "/bean")
    public String bean() {
        return configBean.getGreeting()+" >>"+configBean.getName()+" >>"+ configBean.getUuid()+" >>"+configBean.getMax();
    }
}
