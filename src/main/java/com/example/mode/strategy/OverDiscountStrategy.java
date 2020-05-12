package com.example.mode.strategy;

import java.math.BigDecimal;

/**
 * @author SimonWang
 * @Description
 * @create 2020-05-11 16:56
 */
public class OverDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        // 满100减20优惠:
        return total.compareTo(new BigDecimal(100)) >= 0 ? new BigDecimal(20) : BigDecimal.ZERO;
    }
}
