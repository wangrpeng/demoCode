package com.example.mode.factory;

import java.math.BigDecimal;

public class BeanB implements FactoryBean {

    @Override
    public Number parse(String s) {
        return new BigDecimal(s);
    }
}
