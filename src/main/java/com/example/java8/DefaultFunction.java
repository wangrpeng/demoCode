package com.example.java8;
/*
 * 首先，之前的接口是个双刃剑，好处是面向抽象而不是面向具体编程，缺陷是，当需要修改接口时候，
 * 需要修改全部实现该接口的类，目前的java 8之前的集合框架没有foreach方法，通常能想到的
 * 解决办法是在JDK里给相关的接口添加新的方法及实现。然而，对于已经发布的
 * 版本，是没法在给接口添加新方法的同时不影响已有的实现。所以引进的默认方法。
 * 他们的目的是为了解决接口的修改与现有的实现不兼容的问题。
 *
 * Java 8 的另一个特性是接口可以声明（并且可以提供实现）静态方法。
 */
public class DefaultFunction {

    public static void main(String[] args){
        InterA obj1 = new ClsC();
        obj1.fun1();

    }

}

interface InterA{
    default void fun1(){
        System.out.println("接口A的默认方法");
    }

    static void fun3(){
        System.out.println("接口A的静态方法");
    }
}

interface InterB{
    default void fun2(){
        System.out.println("接口B的默认方法");

    }
}




class ClsC implements InterA,InterB{
    public  void fun1(){
        System.out.println("类C的方法");
        InterA.super.fun1();
        InterB.super.fun2();
        InterA.fun3();
    }
}
