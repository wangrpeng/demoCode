package com.example.multiThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author SimonWang
 * @Description
 * @create 2020-05-14 10:19
 */
public class ReentrantLockDemo {
    private int count = 0;

    private final Lock lock = new ReentrantLock();
    public void addCount(int n) throws InterruptedException {
//        和synchronized不同的是，ReentrantLock可以尝试获取锁：不会死锁 更安全
        if (lock.tryLock(1, TimeUnit.SECONDS)) {
            try{
                count += n;
            }finally {
                lock.unlock();
            }
        }
    }
}

