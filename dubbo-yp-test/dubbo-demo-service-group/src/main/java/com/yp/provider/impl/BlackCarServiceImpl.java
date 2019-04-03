package com.yp.provider.impl;

import com.yp.api.CarService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yepeng on 2019/04/01.
 */
public class BlackCarServiceImpl implements CarService {
    @Override
    public List<String> getCar() {
        ArrayList<String> list = new ArrayList<>();
        list.add("black bz");
        list.add("black bm");
        return list;
    }
}
