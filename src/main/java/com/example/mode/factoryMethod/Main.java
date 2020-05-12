package com.example.mode.factoryMethod;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.List;

/**
 * @author SimonWang
 * @Description 工厂方法
 * 定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method使一个类的实例化延迟到其子类。
 * 工厂方法的目的是使得创建对象和使用对象是分离的，并且客户端总是引用抽象工厂和抽象产品：
 * 实际更常用的是更简单的静态工厂方法，它允许工厂内部对创建产品进行优化。
 * @create 2020-05-12 10:30
 */
public class Main {
    public static void main(String[] args) throws Exception {

        // 客户端中, 我们只需要和工厂接口NumberFactory以及抽象产品Number打交道：
        NumberFactory factory = NumberFactory.getFactory();
        System.out.println(factory.parse("123.456"));

        // 静态工厂方法 , 更简化
        NumberFactory.parser2("123.456");

//        静态工厂方法广泛地应用在Java标准库中 Integer 既是产品也是工厂
        Integer.valueOf(123);
        Arrays.asList("a", "b");
//        产品名称获得产品实例，不但调用简单，而且获得的引用仍然是MessageDigest这个抽象类。
        MessageDigest.getInstance("MD5");
        MessageDigest.getInstance("SHA-1");
    }
}
