package com.ynz.demo.aop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * @EnableAspectJAutoProxy used together with @Configuration
 */
@Configuration
@ComponentScan(basePackages = "com.ynz.demo.aop")
@PropertySource("classpath:app.properties")
@EnableAspectJAutoProxy
public class AppConfig {
}
