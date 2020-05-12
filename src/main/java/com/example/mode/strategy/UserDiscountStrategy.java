package com.example.mode.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author SimonWang
 * @Description 普通用户策略如下：
 * @create 2020-05-11 16:51
 */
public class UserDiscountStrategy implements DiscountStrategy {
    @Override
    public BigDecimal getDiscount(BigDecimal total) {
        // 普通用户打九折
        return total.multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.DOWN);
    }

}
