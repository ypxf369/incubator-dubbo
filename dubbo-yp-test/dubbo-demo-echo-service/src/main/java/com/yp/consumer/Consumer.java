package com.yp.consumer;

import com.yp.api.HelloService;
import org.apache.dubbo.rpc.service.EchoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yepeng on 2019/04/02.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        EchoService echoService = (EchoService) context.getBean(HelloService.class);
        // 回声测试可用性
        String status = (String) echoService.$echo("OK");
        assert (status.equals("OK"));
    }
}
