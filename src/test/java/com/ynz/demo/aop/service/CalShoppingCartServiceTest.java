package com.ynz.demo.aop.service;

import com.ynz.demo.aop.config.AppConfig;
import com.ynz.demo.aop.model.Item;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

class CalShoppingCartServiceTest {
    private static ApplicationContext context;
    private static CalShoppingCartService service;

    @BeforeAll
    static void setUp() {
        context = new AnnotationConfigApplicationContext(AppConfig.class);
        service = context.getBean(CalShoppingCartService.class);
    }

    @Test
    @DisplayName("Promotion aspect")
    void calPromotionAfterShoppingCart() {
        Item item1 = Item.builder().amount(1L).price(250.00).build();
        Item item2 = Item.builder().amount(2L).price(25.00).build();
        List<Item> items = Arrays.asList(item1, item2);

        Double paymentAfterPromotion = service.calPayment(items);

    }
}