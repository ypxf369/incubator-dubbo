package com.yp.api;

import java.util.concurrent.CompletableFuture;

/**
 * Created by yepeng on 2019/04/02.
 */
public interface AsyncHelloService {
    CompletableFuture<String> sayHelloAsync(String name);
}
