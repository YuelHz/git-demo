package com.yuel;

import com.yuel.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明是一个入口类  并且是springboot的入口类
 *
 * @EnableConfigurationProperties
 * 告诉主程序入口类  要自动引入配置文件
 * 配置文件的类作为他的参数
 */
@SpringBootApplication
@EnableConfigurationProperties(FoodConfig.class)
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
