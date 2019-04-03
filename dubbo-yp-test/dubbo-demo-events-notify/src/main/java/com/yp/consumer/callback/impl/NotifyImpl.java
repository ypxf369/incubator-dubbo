package com.yp.consumer.callback.impl;

import com.yp.consumer.callback.Notify;

/**
 * Created by yepeng on 2019/04/02.
 */
public class NotifyImpl implements Notify {
    @Override
    public void onreturn(String result, String par) {
        System.out.println("---调用之后---" + result + "__" + par);
    }

    @Override
    public void oninvoke(String str) {
        System.out.println("---调用之前---" + str);
    }

    @Override
    public void onthrow() {
        System.out.println("---出现异常了---");
    }
}
