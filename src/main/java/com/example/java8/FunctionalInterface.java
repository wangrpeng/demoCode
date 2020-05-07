package com.example.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
����ʽ�ӿ�(Functional Interface)����һ������һ����������ͨ�ӿڡ�\
���һ���ӿڶ����Ψһһ�����󷽷�����ô����ӿھͳ�Ϊ����ʽ�ӿڡ�ͬʱ��������һ���µ�ע�⣺@FunctionalInterface��
����ʽ�ӿڿ��Ա���ʽת��Ϊlambda���ʽ��������lambda���ʽ��ʵ��������ʽ�ӿ�
���еĺ���ʽ�ӿڿ����Ѻõ�֧�� lambda��
 */
public class FunctionalInterface {

    public static void main(String args[]) {


        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Predicate<Integer> predicate = n -> true
        // n ��һ���������ݵ� Predicate �ӿڵ� test ����
        // n ��������� test �������� true

        System.out.println("�����������:");
        // ���ݲ��� n
        eval(list, n -> true);

        // Predicate<Integer> predicate1 = n -> n%2 == 0
        // n ��һ���������ݵ� Predicate �ӿڵ� test ����
        // ��� n%2 Ϊ 0 test �������� true
        System.out.println("�������ż��:");
        eval(list, n -> n % 2 == 0);

        System.out.println("�������1С��4 ����������:");
        eval(list, n -> n > 1 && n < 4);

    }

    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        for (Integer n : list) {

            if (predicate.test(n)) {
                System.out.println(n + " ");
            }
        }
    }


}
