package com.example.multiThread;

import java.util.concurrent.locks.StampedLock;

/**
 * @author SimonWang
 * @Description StampedLock和ReadWriteLock相比，改进之处在于：读的过程中也允许获取写锁后写入！
 * 这种读锁是一种乐观锁。而ReadWriteLock的读是一种悲观锁
 * StampedLock把读锁细分为乐观读和悲观读，能进一步提升并发效率。但这也是有代价的：
 * 一是代码更加复杂，二是StampedLock是不可重入锁，不能在一个线程中反复获取同一个锁。
 * @create 2020-05-14 14:09
 */
public class StampedLockDemo {
}


class Point {
    private final StampedLock stampedLock = new StampedLock();
    private double x;
    private double y;
    public void move(double deltaX, double deltaY) {
        long stamp = stampedLock.writeLock();
        try{
            x += deltaX;
            y += deltaY;
        }finally {
            stampedLock.unlock(stamp);
        }
    }
    //获取到原点的位置
    public double distanceFromOrigin() {
        long stamp = stampedLock.tryOptimisticRead(); // 获取一个乐观读锁(返回的是版本号，不是锁，根本没有锁)
        // 注意下面两行代码不是原子操作
        // 假设x,y = (100,200)
        double currentX = x;
        // 此处已读取到x=100，但x,y可能被写线程修改为(300,400)
        double currentY = y;
        // 此处已读取到y，如果没有写入，读取是正确的(100,200)
        if(!stampedLock.validate(stamp)){ // 检查乐观读锁后是否有其他写锁发生
            stamp = stampedLock.readLock();
            try{
                currentX = x;
                currentY = y;
            }finally {
                stampedLock.unlock(stamp); // 释放悲观读锁
            }
        }
        return Math.sqrt(currentX * currentX + currentY * currentY);
    }




}