package com.ynz.demo.aop.service;

import com.ynz.demo.aop.config.AppConfig;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ToughJobServiceTest {
    private static ApplicationContext context;
    private static ToughJobService jobService;

    @BeforeAll
    static void setUp() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        jobService = context.getBean(ToughJobService.class);
    }


    @Test
    void longRunTask() {
        Long result = jobService.longRunTask();
        assertEquals(result,2021);
    }
}