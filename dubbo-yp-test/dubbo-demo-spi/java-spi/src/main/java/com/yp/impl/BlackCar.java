package com.yp.impl;

import com.yp.api.Car;

/**
 * Created by yepeng on 2019/04/04.
 */
public class BlackCar implements Car {
    @Override
    public String getCar(String name) {
        return "Black Car " + name;
    }
}
