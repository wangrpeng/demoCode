package com.example.mode.factory;

import java.math.BigInteger;

public class BeanA implements FactoryBean {



    @Override
    public Number parse(String s) {
        return new BigInteger(s);
    }
}
