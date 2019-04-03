package com.yp.consumer;

import com.yp.api.CarService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;


/**
 * Created by yepeng on 2019/04/01.
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        CarService carService = context.getBean(CarService.class);
        List<String> list = carService.getCar();

        System.out.println(list);

    }
}
