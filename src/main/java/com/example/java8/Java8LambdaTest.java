package com.example.java8;

public class Java8LambdaTest {

    /**
     * @param argsf
     *
     * Lambda表达式
     * Lambda 允许把函数作为一个方法的参数（函数作为参数传递进方法中）。
     * 格式：
     * (parameters) -> expression
     * or
     * (parameters) -> {statements;}
    可选类型声明：不需要声明参数类型，编译器可以统一识别参数值。
    可选的参数圆括号：一个参数无需定义圆括号，但多个参数需要定义圆括号。
    可选的大括号：如果主体包含了一个语句，就不需要使用大括号。
    可选的返回关键字：如果主体只有一个表达式返回值则编译器会自动返回值，大括号需要指定明表达式返回了一个数值
    使用 Lambda 表达式需要注意以下两点：
    Lambda 表达式主要用来定义行内执行的方法类型接口，例如，一个简单方法接口。在上面例子中，我们使用各种类型的Lambda表达式来定义MathOperation接口的方法。然后我们定义了sayMessage的执行。
    Lambda 表达式免去了使用匿名方法的麻烦，并且给予Java简单但是强大的函数化的编程能力。
     *
     */
    public static void main(String[] args) {



        // 类型声明
        MathOperation addition = (int a, int b) -> a+b;
        // 不用类型声明
        MathOperation sub = (a,b) -> a-b;
        // 大括号中的返回语句
        MathOperation mult = (int a, int  b) -> {return a*b;};
        // 没有大括号及返回语句
        MathOperation divi = (int a,int b) -> a/b;

        System.out.println(operate(3,4,addition));
        System.out.println(operate(3,4,sub));
        System.out.println(operate(3,4,mult));
        System.out.println(operate(3,4,divi));

        // 不用括号
        GreetingService service1 = message ->
                System.out.println("hello"+ message);
        // 用括号
        GreetingService service2 = (message) ->
                System.out.println("hello "+ message);

        service1.sayMessage("google");
        service2.sayMessage("baibu");
    }



    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private static  int  operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }

}