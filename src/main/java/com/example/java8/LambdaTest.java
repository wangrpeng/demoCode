package com.wang.java8;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Lambda允许把函数作为一个方法的参数 或者把代码看成数据,可以实例化函数式接口
 * 格式：
 * （parameter） -> expression
 * (parameter) -> {statements;}
 */
public class LambdaTest {

    public static void main(String[] args) {
        Arrays.asList("a","b","c").forEach(p ->System.out.println(p));
		/*
			 一个函数式接口非常有价值的属性就是他们能够用lambdas来实例化，
			 常见的lambda表达式例子

			 (int x, int y) -> { return x + y; }
			 (x, y) -> x + y
			 x -> x * x
			 () -> x(官方名称: "burger arrow")
			 x -> { System.out.println(x); }
			 静态方法引用：
			 String::valueOf <==>  x -> String.valueof(x)
			 非静态方法引用：
			 Object::toString <==>  x -> x.toString()
			 继承的函数引用：
			 x::toString <==>  () -> x.toString()
			 构造函数引用：
			 ArrayList::new <==>  () -> new ArrayList()
		 */


        //实例化函数式接口
        Comparator<String> c = (a, b) -> Integer.compare(a.length(),b.length());

        Runnable r = () -> { System.out.println("Running1"); System.out.println("Running2");};
        r.run();

//		捕获和非捕获的Lambda表达式
        int x = 5;
//		y -> {return x + y;};
//		当Lambda表达式访问一个定义在Lambda表达式体外的非静态变量或者对象时，
//		这个Lambda表达式称为“捕获的”。比如，下面这个lambda表达式捕捉了变量x：
//		为了保证这个lambda表达式声明是正确的，被它捕获的变量必须是“有效final”的。
//		所以要么它们需要用final修饰符号标记，要么保证它们在赋值后不能被改变。



    }



}