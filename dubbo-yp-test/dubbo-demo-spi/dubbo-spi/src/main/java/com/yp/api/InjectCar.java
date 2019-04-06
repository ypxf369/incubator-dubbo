package com.yp.api;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * Created by yepeng on 2019/04/05.
 */
@SPI
public interface InjectCar {
    @Adaptive("injectCar")
    void getCar(URL url);
}
