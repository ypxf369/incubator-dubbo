package com.yp.consumer;

import com.yp.api.AsyncHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by yepeng on 2019/04/02.
 */
public class Consumer {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        AsyncHelloService asyncHelloService = context.getBean(AsyncHelloService.class);
        CompletableFuture<String> future = asyncHelloService.sayHelloAsync("yepeng");
        //System.out.println(future.get());
        future.whenCompleteAsync((v,e)->{
            if(e!=null){
                e.printStackTrace();
            }else{
                System.out.println(v);
            }
        });
        System.out.println("aaa");
    }
}
