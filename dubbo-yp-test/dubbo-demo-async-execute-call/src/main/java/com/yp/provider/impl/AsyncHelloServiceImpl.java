package com.yp.provider.impl;

import com.yp.api.AsyncHelloService;

import java.util.concurrent.CompletableFuture;

/**
 * Created by yepeng on 2019/04/02.
 */
public class AsyncHelloServiceImpl implements AsyncHelloService {
    @Override
    public CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.supplyAsync(() -> "Hello " + name);
    }
}
