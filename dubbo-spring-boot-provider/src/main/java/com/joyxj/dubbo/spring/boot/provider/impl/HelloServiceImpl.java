package com.joyxj.dubbo.spring.boot.provider.impl;


import com.joyxj.dubbo.spring.boot.api.HelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Hello Service 实现类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-06-26
 */
@Service(group = "dubbo-spring-boot-demo",version = "1.0.0")
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }
}
