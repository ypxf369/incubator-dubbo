package com.yp.impl;

import com.yp.api.Car;

/**
 * Created by yepeng on 2019/04/05.
 */
public class CarWrapper implements Car {
    private Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public String getCar(String name) { // Aop
        System.out.println("before");
        String result = car.getCar(name);
        System.out.println("after");
        return result;
    }
}
