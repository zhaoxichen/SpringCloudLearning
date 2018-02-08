package com.forezp.service;

import org.springframework.stereotype.Service;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@Service
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
