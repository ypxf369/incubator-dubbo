package com.yp;

import com.yp.api.Car;
import com.yp.api.InjectCar;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yepeng on 2019/04/04.
 */
public class DubboSPITest {
    public static void main(String[] args) {
        //ExtensionLoader<Car> loader=ExtensionLoader.getExtensionLoader(Car.class);
//        Car redCar = loader.getExtension("redCar");
//        System.out.println(redCar.getCar("yepeng"));

        ExtensionLoader<InjectCar> loader = ExtensionLoader.getExtensionLoader(InjectCar.class);

        // dubbo框架生成实现该接口的代理类
        //loader.getAdaptiveExtension();

        Map<String, String> map = new HashMap<>();
        map.put("injectCar", "injectCar");
        URL url = new URL("", "", 1, map);
        InjectCar injectCar = loader.getExtension("injectCar");
        injectCar.getCar(url);
    }
}
