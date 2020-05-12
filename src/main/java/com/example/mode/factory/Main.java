package com.example.mode.factory;

public class Main  {

    public static void main(String[] args) {
//        调用方可以完全忽略真正的工厂Impl和实际的产品BigDecimal，
//        这样做的好处是允许创建产品的代码独立地变换，而不会影响到调用方。
        FactoryBean.getBean("BeanA").parse("932491");
        FactoryBean.getBean("BeanB").parse("1245");
    }

}
