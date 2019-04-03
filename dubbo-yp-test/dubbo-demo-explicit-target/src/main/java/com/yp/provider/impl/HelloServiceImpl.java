package com.yp.provider.impl;

import com.yp.api.HelloService;

/**
 * Created by yepeng on 2019/04/01.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
