package com.example.mode.factoryMethod;

import java.math.BigDecimal;

/**
 * @author SimonWang
 * @Description 编写一个工厂的实现类：
 * @create 2020-05-12 10:36
 */
public class NumberFactoryImpl implements NumberFactory {
    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
