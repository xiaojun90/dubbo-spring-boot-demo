package com.joyxj.dubbo.spring.boot.provider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务提供者启动类
 *
 * @author xiaoj
 * @version 1.0
 * @date 2019-06-26
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.joyxj.dubbo.spring.boot.provider")
@EnableDubboConfig
public class DubboSpringBootProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboSpringBootProviderApplication.class,args);
    }
}
