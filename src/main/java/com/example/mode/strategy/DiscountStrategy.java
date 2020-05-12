package com.example.mode.strategy;

import java.math.BigDecimal;

/**
 * @author SimonWang
 * @Description 先定义打折策略接口：
 * @create 2020-05-11 16:50
 */
public interface DiscountStrategy {
    // 计算折扣额度:
    BigDecimal getDiscount(BigDecimal total);

}
