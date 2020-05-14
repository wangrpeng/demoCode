package com.example.multiThread;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SimonWang
 * @Description 线程同步
 *  synchronized 使用:
 *  找出修改共享变量的线程代码块
 * 选择一个共享实例作为锁；
 * 使用synchronized(lockObject) { ... }
 * @create 2020-05-13 14:42
 */
public class ThreadSync {
    public static void main(String[] args) throws Exception{
        Thread add = new AddThread();
        Thread dec = new DecThread();
        add.start();
        dec.start();
        add.join();
        dec.join();
        System.out.println(Counter.count);
    }

}

class Counter{
    public static final Object lock = new Counter();
    public static int count =0 ;

}
class AddThread extends Thread{
    List list = new ArrayList<>();
    @Override
    public void run() {
        synchronized (Counter.lock) {
            for (int i=0; i<10000; i++) {
                Counter.count++;
            }
        }
    }
}
class DecThread extends Thread {
    public void run() {
        synchronized (Counter.lock) {
            for (int i=0; i<10000; i++) {
                Counter.count--;
            }
        }
    }
}
