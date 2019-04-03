package com.yp.consumer;

import com.yp.api.HelloService;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ReferenceConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.utils.ReferenceConfigCache;

/**
 * Created by yepeng on 2019/04/02.
 */
public class Consumer {
    public static void main(String[] args) {
        // 当前应用配置
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("hello-service-consumer");

        // 注册中心配置
        RegistryConfig registryConfig = new RegistryConfig("zookeeper://127.0.0.1:2181");

        // 引用远程服务
        ReferenceConfig<HelloService> config = new ReferenceConfig<>();
        config.setApplication(applicationConfig);
        config.setRegistry(registryConfig);
        config.setInterface(HelloService.class);

        // 缓存服务配置
        ReferenceConfigCache configCache=ReferenceConfigCache.getCache();
        HelloService helloService1 = configCache.get(config);

        // 使用service
        //HelloService helloService = config.get();

        System.out.println(helloService1.sayHello("yepeng"));
    }
}
