package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
/*
 * Java8 方法引用
 *
 */
public class FunctionQuote {

    public static void main(String[] args) {

        //构造器引用 语法是Class::new，或者更一般的Class< T >::new实例如下
        Car car = Car.create(Car :: new );
        List< Car > cars = Arrays.asList( car );

        //静态方法引用：
        cars.forEach(Car :: collide);


        //特定类的任意对象的方法引用
        cars.forEach( Car::repair );

        //特定对象的方法引用
        final Car police = Car.create( Car::new );
        cars.forEach( police::follow );


        //静态方法引用
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);
    }

}


class Car{

    public static Car create( final Supplier< Car > supplier ) {
        return supplier.get();
    }


    public static void collide( final Car car ) {
        System.out.println( "Collided " + car.toString() );
    }

    public void follow( final Car another ) {
        System.out.println( "Following the " + another.toString() );
    }

    public void repair() {
        System.out.println( "Repaired " + this.toString() );
    }







}