package com.example.mode.factory;

import java.math.BigDecimal;

public interface FactoryBean {

    Number parse(String s);


    static FactoryBean getBean(String beanName) {
        if ("BeanA".equals(beanName)) {
            return new BeanA();
        }
        if ("BeanB".equals(beanName)) {
            return new BeanB();
        }
        return null;
    }

    //静态工厂方法, 实际中更常用
    static Number parse2(String s) {
        return new BigDecimal(s);
    }





}
