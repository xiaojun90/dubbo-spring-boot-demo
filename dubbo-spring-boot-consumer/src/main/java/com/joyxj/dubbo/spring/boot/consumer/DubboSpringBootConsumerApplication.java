package com.joyxj.dubbo.spring.boot.consumer;


import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-06-26
 */
@SpringBootApplication
@EnableDubboConfig
@EnableDubbo(scanBasePackages = "com.joyxj.dubbo.spring.boot.consumer")
public class DubboSpringBootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootConsumerApplication.class,args);
    }
}
