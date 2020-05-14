package com.example.multiThread;

/**
 * @author SimonWang
 * @Description 我们知道Java程序依靠synchronized对线程进行同步，使用synchronized的时候，锁住的是哪个对象非常重要。
 * 让线程自己选择锁对象往往会使得代码逻辑混乱，也不利于封装。更好的方法是把synchronized逻辑封装起来。例如，我们编写一个计数器如下：
 *  我们称 counter2计数器是线程安全的,
 * @create 2020-05-13 15:51
 */
public class SynchMethod {
    public static void main(String[] args) throws Exception{

        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();

        new Thread(() -> {
            c1.addCount();
        }).start();
        new Thread(() -> {
            c2.addCount();
        }).start();
        Thread.sleep(1000);
        System.out.println(c1.getCount());
        System.out.println(c2.getCount());
    }
}

class Counter2{
    private int count = 0;

    public int getCount() {
        return count;
    }

    public void addCount() {
        synchronized (this) {
            count++;
        }
    }

    public void descCount() {
        synchronized (this) {
            count--;
        }

    }

}
