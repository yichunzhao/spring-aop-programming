package com.ynz.demo.aop.service;

import com.ynz.demo.aop.aspect.Promotional;
import com.ynz.demo.aop.model.Item;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
public class CalShoppingCartService {

    @Promotional
    Double calPayment(List<Item> items) {
        return items.stream().mapToDouble(item -> item.getAmount()*item.getPrice()).sum();
    }
}
