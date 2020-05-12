package com.example.mode.strategy;

import com.alibaba.fastjson.JSON;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author SimonWang
 * @Description  调用方必须首先创建一个DiscountContext，并指定一个策略（或者使用默认策略），即可获得折扣后的价格
 * @create 2020-05-11 16:24
 */
public class Main {
    public static void main(String[] args) {
        DiscountContext context = new DiscountContext();
        // 默认使用普通会员折扣:
        System.out.println(context.getPrice(new BigDecimal(100)));
        // 使用满减折扣:
        context.setStrategy(new OverDiscountStrategy());
        BigDecimal pay2 = context.getPrice(BigDecimal.valueOf(105));
        System.out.println(pay2);


//        枚举实现策略模式更方便
//        context.setStrategy(Enum_DiscountStrategy.OverDiscountStrategy);


    }
}
