package com.example.java8;

import java.util.Arrays;
import java.util.Comparator;

/*
 * Lambda����Ѻ�����Ϊһ�������Ĳ��� ���߰Ѵ��뿴������,����ʵ��������ʽ�ӿ�
 * ��ʽ��
 * ��parameter�� -> expression
 * (parameter) -> {statements;}
 */
public class LambdaTest {

    public static void main(String[] args) {
        Arrays.asList("a", "b", "c").forEach(p -> System.out.println(p));
		/*
			 һ������ʽ�ӿڷǳ��м�ֵ�����Ծ��������ܹ���lambdas��ʵ������
			 ������lambda���ʽ����
			 
			 (int x, int y) -> { return x + y; }	
			 (x, y) -> x + y
			 x -> x * x
			 () -> x(�ٷ�����: "burger arrow")
			 x -> { System.out.println(x); }
			 ��̬�������ã� 
			 String::valueOf <==>  x -> String.valueof(x)
			 �Ǿ�̬�������ã� 
			 Object::toString <==>  x -> x.toString()
			 �̳еĺ������ã� 
			 x::toString <==>  () -> x.toString()
			 ���캯�����ã� 
			 ArrayList::new <==>  () -> new ArrayList()
		 */


        //ʵ��������ʽ�ӿ�
        Comparator<String> c = (a, b) -> Integer.compare(a.length(), b.length());

        Runnable r = () -> {
            System.out.println("Running1");
            System.out.println("Running2");
        };
        r.run();

//		����ͷǲ����Lambda���ʽ 
        int x = 5;
//		y -> {return x + y;};
//		��Lambda���ʽ����һ��������Lambda���ʽ����ķǾ�̬�������߶���ʱ��
//		���Lambda���ʽ��Ϊ������ġ������磬�������lambda���ʽ��׽�˱���x�� 
//		Ϊ�˱�֤���lambda���ʽ��������ȷ�ģ���������ı��������ǡ���Чfinal���ġ�
//		����Ҫô������Ҫ��final���η��ű�ǣ�Ҫô��֤�����ڸ�ֵ���ܱ��ı䡣 


    }


}













