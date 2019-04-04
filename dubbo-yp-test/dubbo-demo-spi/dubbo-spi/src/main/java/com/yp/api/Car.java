package com.yp.api;

import org.apache.dubbo.common.extension.SPI;

/**
 * Created by yepeng on 2019/04/04.
 */
@SPI
public interface Car {
    String getCar(String name);
}
