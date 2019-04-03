package com.yp.provider;

import com.yp.api.HelloService;
import com.yp.provider.impl.HelloServiceImpl;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.ServiceConfig;

import java.io.IOException;

/**
 * Created by yepeng on 2019/04/02.
 */
public class Provider {
    public static void main(String[] args) throws IOException {
        // 当前应用配置
        ApplicationConfig applicationConfig=new ApplicationConfig();
        applicationConfig.setName("hello-service-provider");

        // 注册中心配置
        RegistryConfig registryConfig=new RegistryConfig("zookeeper://127.0.0.1:2181");

        // 服务提供者暴露服务配置
        ServiceConfig<HelloService> config=new ServiceConfig();
        config.setApplication(applicationConfig);
        config.setRegistry(registryConfig);
        config.setInterface(HelloService.class);
        config.setRef(new HelloServiceImpl());

        // 暴露及注册服务
        config.export();

        System.in.read();
    }
}
