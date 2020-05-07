package com.example.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * java8������
 */
public class Java8Tester {

    /**
     * @param args
     */

    public static void main(String[] args) {


        List<String> list1 = new ArrayList<String>();

        List<Car> li = new ArrayList<Car>();

        list1.add("baidu");
        list1.add("sina");
        list1.add("tencent");
        list1.add("alibaba");
        List<String> list2 = new ArrayList<String>();
        list2.add("baidu");
        list2.add("sina");
        list2.add("tencent");
        list2.add("alibaba");

        Java8Tester java8Tester = new Java8Tester();
        System.out.println("java8test******");
        java8Tester.java8Sort(list1);
        System.out.println(list1);

        System.out.println("java7test*******");
        java8Tester.java7Sort(list2);
        System.out.println(list2);

    }

    private void java7Sort(List<String> list) {
        Collections.sort(list, new Comparator<String>() {
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });


    }

    private void java8Sort(List<String> names) {
        //Lambda���ʽʵ����Comparator�ӿ�(����ʽ�ӿ�)������ʽ�ӿ�ֻ���������󷽷�
        //int compareTo(String anotherString){} ������������������һ��intֵ
        Collections.sort(names, (a, b) -> a.compareTo(b));
    }


}
















