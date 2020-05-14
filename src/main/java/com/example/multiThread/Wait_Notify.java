package com.example.multiThread;

import com.google.errorprone.annotations.Var;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author SimonWang
 * @Description synchronized解决了多线程竞争的问题
 * wait() notify() 方法解决多线程协调问题
 * @create 2020-05-13 16:27
 */
public class Wait_Notify {
    public static void main(String[] args) throws Exception {
        TaskQueue q = new TaskQueue();
        List<Thread> ts = new ArrayList<Thread>();
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread() {
                public void run() {
                    // 执行task:
                    while (true) {
                        try {
                            String s = q.getTask();
                            System.out.println("execute task: " + s);
                        } catch (InterruptedException e) {
                            System.out.println("InterruptedException");
                            return;
                        }
                    }
                }
            };
            t.start();
            ts.add(t);
        }

        Thread add = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                // 放入task:
                String s = "t-" + Math.random();
                System.out.println("add task: " + s);
                q.addTask(s);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException");
                }
            }
        });
        add.start();
        add.join();
        Thread.sleep(100);
        for (Thread t : ts) {
            t.interrupt();
        }

    }
}

 class TaskQueue {
    Queue<String> queue = new LinkedList<>();

    public synchronized void addTask(String s) {
        queue.add(s);
        this.notifyAll();
    }

    public synchronized String getTask() throws InterruptedException {
        //注意:这种写法有问题
//        但实际上while()循环永远不会退出。因为线程在执行while()循环时，已经在getTask()入口获取了this锁，
//        其他线程根本无法调用addTask()，因为addTask()执行条件也是获取this锁。
        while (queue.isEmpty()) {
            this.wait();
        }
        return queue.remove();
    }

}
