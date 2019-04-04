package com.yp;

import com.yp.api.Car;

import java.util.ServiceLoader;

/**
 * Created by yepeng on 2019/04/04.
 */
public class JavaSPITest {
    public static void main(String[] args){
        ServiceLoader<Car> serviceLoader=ServiceLoader.load(Car.class);

        for (Car car : serviceLoader) {
            System.out.println(car.getCar("yepeng"));
        }
    }
}
