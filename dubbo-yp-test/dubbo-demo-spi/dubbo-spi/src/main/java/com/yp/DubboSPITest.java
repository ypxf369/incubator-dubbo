package com.yp;

import com.yp.api.Car;
import org.apache.dubbo.common.extension.ExtensionLoader;

/**
 * Created by yepeng on 2019/04/04.
 */
public class DubboSPITest {
    public static void main(String[] args){
        ExtensionLoader<Car> loader=ExtensionLoader.getExtensionLoader(Car.class);
        Car redCar = loader.getExtension("redCar");
        System.out.println(redCar.getCar("yepeng"));
    }
}
