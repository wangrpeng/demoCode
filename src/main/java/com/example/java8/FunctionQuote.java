package com.example.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*
 * Java8 ��������
 *
 */
public class FunctionQuote {

    public static void main(String[] args) {

        //���������� �﷨��Class::new�����߸�һ���Class< T >::newʵ������
        Car car = Car.create(Car::new);
        List<Car> cars = Arrays.asList(car);

        //��̬�������ã�
        cars.forEach(Car::collide);


        //�ض�����������ķ�������
        cars.forEach(Car::repair);

        //�ض�����ķ�������
        final Car police = Car.create(Car::new);
        cars.forEach(police::follow);


        //��̬��������
        List names = new ArrayList();
        names.add("Google");
        names.add("Runoob");
        names.add("Taobao");
        names.add("Baidu");
        names.add("Sina");
        names.forEach(System.out::println);
    }

}


class Car {

    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }


    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair() {
        System.out.println("Repaired " + this.toString());
    }


}





















