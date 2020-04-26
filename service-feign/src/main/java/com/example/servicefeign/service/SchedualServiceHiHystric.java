package com.example.servicefeign.service;

import org.springframework.stereotype.Component;

/**
 * 说明：
 * Date: 2020/4/26--14:04
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
