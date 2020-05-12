package com.example.mode.strategy;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author SimonWang
 * @Description 用枚举实现策略模式
 * @create 2020-05-11 17:27
 */
public enum Enum_DiscountStrategy {
    UserDiscountStrategy {
        @Override
        BigDecimal getDiscount(BigDecimal total) {
            // 普通会员打九折:
            return total.multiply(new BigDecimal("0.1")).setScale(2, RoundingMode.DOWN);
        }

    },
    OverDiscountStrategy {

        @Override
        BigDecimal getDiscount(BigDecimal total) {
            // 满100减20优惠:
            return total.compareTo(BigDecimal.valueOf(100)) >= 0 ? BigDecimal.valueOf(20) : BigDecimal.ZERO;
        }

    },
    PrimeDiscountStrategy {

        @Override
        BigDecimal getDiscount(BigDecimal total) {
            // Prime会员打七折:
            return total.multiply(new BigDecimal("0.3")).setScale(2, RoundingMode.DOWN);
        }

    },
    OverPrimeDiscountStrategy {

        @Override
        BigDecimal getDiscount(BigDecimal total) {
            // 在满100减20的基础上对Prime会员再打七折:
            BigDecimal count = BigDecimal.valueOf(0);
            count = count.add(OverDiscountStrategy.getDiscount(total));
            count = count.add(PrimeDiscountStrategy.getDiscount(total.subtract(count)));
            return count;
        }

    };

    abstract BigDecimal getDiscount(BigDecimal total);

    public void print(int key) {
    }

}
