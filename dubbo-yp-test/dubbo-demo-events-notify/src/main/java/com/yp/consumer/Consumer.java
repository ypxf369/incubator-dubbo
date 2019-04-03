package com.yp.consumer;

import com.yp.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yepeng on 2019/04/02.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        HelloService bean = context.getBean(HelloService.class);
        System.out.println(bean.sayHello("yepeng"));
    }
}
