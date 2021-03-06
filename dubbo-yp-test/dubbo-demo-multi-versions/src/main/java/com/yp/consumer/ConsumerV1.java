package com.yp.consumer;

import com.yp.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yepeng on 2019/04/01.
 */
public class ConsumerV1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer-v1.xml");
        context.start();
        HelloService bean = context.getBean(HelloService.class);
        System.out.println(bean.sayHello());
    }
}
