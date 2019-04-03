package com.yp.consumer;

import com.yp.api.GreetService;
import com.yp.api.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yepeng on 2019/04/01.
 */
public class BasicConsumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        //HelloService helloService = context.getBean(HelloService.class);
        //GreetService greetService = context.getBean(GreetService.class);
//        for (int i = 0; i < 10; i++) {
//            String sayHello = helloService.sayHello("yepeng");
//            System.out.println(sayHello);
//            String sendGreeting = greetService.sendGreeting("yepeng");
//            System.out.println(sendGreeting);
//        }

        System.in.read();
    }
}
