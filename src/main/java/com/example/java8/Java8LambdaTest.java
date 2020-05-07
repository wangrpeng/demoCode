package com.example.java8;

public class Java8LambdaTest {

    /**
     * @param argsf Lambda���ʽ
     *              Lambda ����Ѻ�����Ϊһ�������Ĳ�����������Ϊ�������ݽ������У���
     *              ��ʽ��
     *              (parameters) -> expression
     *              or
     *              (parameters) -> {statements;}
     *              ��ѡ��������������Ҫ�����������ͣ�����������ͳһʶ�����ֵ��
     *              ��ѡ�Ĳ���Բ���ţ�һ���������趨��Բ���ţ������������Ҫ����Բ���š�
     *              ��ѡ�Ĵ����ţ�������������һ����䣬�Ͳ���Ҫʹ�ô����š�
     *              ��ѡ�ķ��عؼ��֣��������ֻ��һ�����ʽ����ֵ����������Զ�����ֵ����������Ҫָ�������ʽ������һ����ֵ
     *              <p>
     *              ʹ�� Lambda ���ʽ��Ҫע���������㣺
     *              Lambda ���ʽ��Ҫ������������ִ�еķ������ͽӿڣ����磬һ���򵥷����ӿڡ������������У�����ʹ�ø������͵�Lambda���ʽ������MathOperation�ӿڵķ�����Ȼ�����Ƕ�����sayMessage��ִ�С�
     *              Lambda ���ʽ��ȥ��ʹ�������������鷳�����Ҹ���Java�򵥵���ǿ��ĺ������ı��������
     */
    public static void main(String[] args) {


        // ��������
        MathOperation addition = (int a, int b) -> a + b;
        // ������������
        MathOperation sub = (a, b) -> a - b;
        // �������еķ������
        MathOperation mult = (int a, int b) -> {
            return a * b;
        };
        // û�д����ż��������
        MathOperation divi = (int a, int b) -> a / b;

        System.out.println(operate(3, 4, addition));
        System.out.println(operate(3, 4, sub));
        System.out.println(operate(3, 4, mult));
        System.out.println(operate(3, 4, divi));

        // ��������
        GreetingService service1 = message ->
                System.out.println("hello" + message);
        // ������
        GreetingService service2 = (message) ->
                System.out.println("hello " + message);

        service1.sayMessage("google");
        service2.sayMessage("baibu");
    }


    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private static int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }

}
















