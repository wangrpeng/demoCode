package com.example.mode.factoryMethod;

import java.math.BigDecimal;

/**
 * @author SimonWang
 * @Description 假设我们希望实现一个解析字符串到Number的Factory，可以定义如下：
 * @create 2020-05-12 10:35
 */
public interface NumberFactory {
    Number parse(String s);

    // 获取工厂实例:
    static NumberFactory getFactory(){
        return new NumberFactoryImpl();
    }
    //静态工厂方法 , 工厂方法的简化
    static Number parser2(String s) {
        return new BigDecimal(s);
    }

}
