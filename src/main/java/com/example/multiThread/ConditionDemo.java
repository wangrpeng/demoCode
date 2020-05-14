package com.example.multiThread;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SimonWang
 * @Description Condition对象来实现wait和notify的功能。
 * @create 2020-05-14 11:16
 */
public class ConditionDemo {
}

class TaskQueue2{

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private Queue<String> queue = new LinkedList<>();

    public void addTask(String s) {
        lock.lock();
        try {
            queue.add(s);
            condition.signalAll();
        }finally {
            lock.unlock();
        }
    }


    public String getTask() throws InterruptedException {
        lock.lock();
        try {
//            tryLock()类似，await()可以在等待指定时间后，如果还没有被其他线程通过signal()或signalAll()唤醒，可以自己醒来：
            while (queue.isEmpty()) {
                if (condition.await(1, TimeUnit.SECONDS)) {

                }
            }
            return queue.remove();
        } finally {
            lock.unlock();
        }
    }



}