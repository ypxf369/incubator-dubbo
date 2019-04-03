package com.yp.consumer;

import com.yp.api.HelloService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by yepeng on 2019/04/02.
 */
public class Consumer {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        HelloService helloService = context.getBean(HelloService.class);
        System.out.println(helloService.sayHello("yepeng"));

        System.out.println("消费端：" + RpcContext.getContext().isConsumerSide());

        // 获取调用发ip地址
        System.out.println("提供方ip地址为：" + RpcContext.getContext().getRemoteHost());

        // 设置隐式参数
        RpcContext.getContext().setAttachment("index", "123");

        System.in.read();
    }
}
