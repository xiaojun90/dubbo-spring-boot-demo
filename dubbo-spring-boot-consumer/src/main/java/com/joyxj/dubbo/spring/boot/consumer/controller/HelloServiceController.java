package com.joyxj.dubbo.spring.boot.consumer.controller;

import com.joyxj.dubbo.spring.boot.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello Service Controller
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-06-26
 */
@RestController
public class HelloServiceController {

    @Reference(group = "dubbo-spring-boot-demo",version = "1.0.0")
    private HelloService helloService;

    @RequestMapping(value = "hello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return helloService.sayHello(name);
    }

}
