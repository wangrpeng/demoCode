package com.example.multiThread;

import org.assertj.core.api.ThrowableAssert;
import sun.security.ssl.SSLContextImpl;

/**
 * @author SimonWang
 * @Description 线程状态
 * @create 2020-05-13 10:25
 */
public class ThreadState {
    public static void main(String[] args) throws  Exception {
        /*
        线程状态:
        New : 新创建线程, 尚未执行
        Runnable: 运行中 ,正在执行 run方法
        Blocked: 运行中的线程,因为某种操作被阻塞挂起
        Waiting: 运行中的线程, 因为某种操作在等待 例如 join()
        TimeWaiting:运行中的线程, 执行了sleep()方法计时等待
        Terminated : 终止 run() 执行 完毕 或者抛出异常
         */
        System.out.println("main start");
        Thread t1 = new Thread(() ->{
            System.out.println("t1执行");
        });
        t1.start();
        t1.join();
        System.out.println("main end");

    }
}
