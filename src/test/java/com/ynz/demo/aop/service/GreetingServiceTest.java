package com.ynz.demo.aop.service;

import com.ynz.demo.aop.config.AppConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class GreetingServiceTest {
    private static ApplicationContext context;
    private static GreetingService service;

    @BeforeAll
    static void setUp() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        service = context.getBean(GreetingService.class);
    }

    @Test
    void greeting() {
        service.Greeting("Mike");
    }

    @Test
    void warmGreeting() {
        service.WarmGreeting("Pia");
    }

    @Test
    void hotGreeting() {
        service.HotGreeting("Mia");
    }
}