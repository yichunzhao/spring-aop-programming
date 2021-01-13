package com.ynz.demo.aop.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Item {
    private Long amount;
    private Double price;
}
