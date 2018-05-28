package com.lay.amap.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * @author yalei.chen
 * @date 2018/5/28
 * @since JDK 1.8
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext app = SpringApplication.run(Application.class, args);
    }
}
