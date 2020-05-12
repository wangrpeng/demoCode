package com.example.mode.strategy;

import java.math.BigDecimal;

/**
 * @author SimonWang
 * @Description 一个完整的策略模式要定义策略以及使用策略的上下文
 * @create 2020-05-11 16:58
 */
public class DiscountContext {
    // 默认策略
    private DiscountStrategy strategy = new UserDiscountStrategy();

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public BigDecimal getPrice(BigDecimal total) {
        return total.subtract(strategy.getDiscount(total)).setScale(2);
    }


}
