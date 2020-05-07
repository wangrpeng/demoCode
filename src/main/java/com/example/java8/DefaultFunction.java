package com.example.java8;

/*
 * ���ȣ�֮ǰ�Ľӿ��Ǹ�˫�н����ô�����������������������̣�ȱ���ǣ�����Ҫ�޸Ľӿ�ʱ��
 * ��Ҫ�޸�ȫ��ʵ�ָýӿڵ��࣬Ŀǰ��java 8֮ǰ�ļ��Ͽ��û��foreach������ͨ�����뵽��
 * ����취����JDK�����صĽӿ�����µķ�����ʵ�֡�Ȼ���������Ѿ�������
 * �汾����û���ڸ��ӿ�����·�����ͬʱ��Ӱ�����е�ʵ�֡�����������Ĭ�Ϸ�����
 * ���ǵ�Ŀ����Ϊ�˽���ӿڵ��޸������е�ʵ�ֲ����ݵ����⡣
 *
 * Java 8 ����һ�������ǽӿڿ������������ҿ����ṩʵ�֣���̬������
 */
public class DefaultFunction {

    public static void main(String[] args) {
        InterA obj1 = new ClsC();
        obj1.fun1();

    }

}

interface InterA {
    default void fun1() {
        System.out.println("�ӿ�A��Ĭ�Ϸ���");
    }

    static void fun3() {
        System.out.println("�ӿ�A�ľ�̬����");
    }
}

interface InterB {
    default void fun2() {
        System.out.println("�ӿ�B��Ĭ�Ϸ���");

    }
}


class ClsC implements InterA, InterB {
    public void fun1() {
        System.out.println("��C�ķ���");
        InterA.super.fun1();
        InterB.super.fun2();
        InterA.fun3();
    }
}


