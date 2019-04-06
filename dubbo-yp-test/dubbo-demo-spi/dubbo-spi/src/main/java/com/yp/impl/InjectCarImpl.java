package com.yp.impl;

import com.yp.api.InjectCar;
import org.apache.dubbo.common.URL;

/**
 * Created by yepeng on 2019/04/05.
 */
public class InjectCarImpl implements InjectCar {
    private InjectCar injectCar;

    // 注入点
    public void setInjectCarImpl(InjectCar injectCar) {
        this.injectCar = injectCar;
    }

    @Override
    public void getCar(URL url) {
        System.out.println("注入...");
        injectCar.getCar(url);
    }
}
