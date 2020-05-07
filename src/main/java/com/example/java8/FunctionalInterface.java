package com.wang.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
函数式接口(Functional Interface)就是一个具有一个方法的普通接口。\
如果一个接口定义个唯一一个抽象方法，那么这个接口就成为函数式接口。同时，引入了一个新的注解：@FunctionalInterface。
函数式接口可以被隐式转换为lambda表达式。可以用lambda表达式来实例化函数式接口
现有的函数式接口可以友好地支持 lambda。
 */
public class FunctionalInterface {

    public static void main(String args[]){


        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // Predicate<Integer> predicate = n -> true
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // n 如果存在则 test 方法返回 true

        System.out.println("输出所有数据:");
        // 传递参数 n
        eval(list, n->true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n 是一个参数传递到 Predicate 接口的 test 方法
        // 如果 n%2 为 0 test 方法返回 true
        System.out.println("输出所有偶数:");
        eval(list,n -> n%2==0);

        System.out.println("输出大于1小于4 的所有数字:");
        eval(list,n -> n>1 &&n<4);

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for(Integer n: list) {

            if(predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }


}