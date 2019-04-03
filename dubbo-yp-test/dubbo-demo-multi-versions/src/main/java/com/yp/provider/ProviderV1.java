package com.yp.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yepeng on 2019/04/01.
 */
public class ProviderV1 {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("provider-v1.xml");
        context.start();
        System.in.read();
    }
}
