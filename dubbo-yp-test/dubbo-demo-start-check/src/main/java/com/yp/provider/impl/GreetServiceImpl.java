package com.yp.provider.impl;

import com.yp.api.GreetService;

/**
 * Created by yepeng on 2019/04/01.
 */
public class GreetServiceImpl implements GreetService {
    @Override
    public String sendGreeting(String name) {
        return "Heloo " + name;
    }
}
