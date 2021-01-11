package com.ynz.demo.aop;

import com.ynz.demo.aop.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoSpringAop {

    public static void main(String[] args) {
        System.out.println("Demo Spring Aop");
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

    }
}
