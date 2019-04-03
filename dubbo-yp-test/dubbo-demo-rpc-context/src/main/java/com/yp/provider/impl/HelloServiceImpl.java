package com.yp.provider.impl;

import com.yp.api.HelloService;
import org.apache.dubbo.rpc.RpcContext;

/**
 * Created by yepeng on 2019/04/02.
 */
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {

        System.out.println("提供端：" + RpcContext.getContext().isProviderSide());

        // 获取调用发ip地址
        System.out.println("消费方ip地址为：" + RpcContext.getContext().getRemoteHost());
        // 获取消费端隐式参数
        String par = RpcContext.getContext().getAttachment("index");
        System.out.println(par);

        return "Hello " + name;
    }
}
