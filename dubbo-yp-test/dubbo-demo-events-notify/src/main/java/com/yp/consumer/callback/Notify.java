package com.yp.consumer.callback;

/**
 * Created by yepeng on 2019/04/02.
 */
public interface Notify {
    void onreturn(String result, String par);

    void oninvoke(String str);

    void onthrow();
}
