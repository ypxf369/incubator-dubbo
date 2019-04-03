package com.yp.consumer;

import com.yp.api.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by yepeng on 2019/04/01.
 */
public class BasicConsumer {
    public static void main(String[] args) throws IOException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        HelloService helloService = context.getBean(HelloService.class);
        for (int i = 0; i < 100; i++) {
            String sayHello = helloService.sayHello("yepeng");
            URL url = RpcContext.getContext().getUrl();
            System.out.println(sayHello + "serviceName: " + url.getIp() + " port: " + url.getPort() + " addr:" + url.getAddress());
            TimeUnit.MILLISECONDS.sleep(500);
        }

        System.in.read();
    }
}
