package com.example.multiThread;

import org.assertj.core.data.Index;

import java.util.Arrays;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author SimonWang
 * @Description ReadWriteLock 它保证：
 * 只允许一个线程写入（其他线程既不能写入也不能读取）；
 * 没有写入时，多个线程允许同时读（提高性能）
 * 适用场景: 适用条件是同一个数据，有大量线程读取，但仅有少数线程修改。
 * @create 2020-05-14 13:50
 */
public class ReadWriteLockDemo {
}

class  Counter3{
    private final ReadWriteLock rwLock = new ReentrantReadWriteLock();
    private final Lock rLock = rwLock.readLock();
    private final Lock wLock = rwLock.writeLock();

    private int[] counts = new int[10];

    public void inc(int Index) {
        wLock.lock();  //写加锁 其他线程会等待此锁释放才能执行
        try{
            counts[Index]++;
        }finally {
            wLock.unlock();
        }
    }

    public int[] get() {
        rLock.lock();  // 读加锁,在没有写的情况下, 多线程可以同时读 这样就大大提高了并发读的执行效率。
        try {
            return Arrays.copyOf(counts, counts.length);
        }finally {
            rLock.unlock();
        }
    }

}


