package com.yp.provider.impl;

/**
 * Created by yepeng on 2019/04/01.
 */
public class HelloServiceV2 implements com.yp.api.HelloService {
    @Override
    public String sayHello() {
        return "Hello World V2";
    }
}
