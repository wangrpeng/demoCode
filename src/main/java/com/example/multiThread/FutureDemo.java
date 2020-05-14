package com.example.multiThread;

import com.alibaba.fastjson.parser.Feature;
import net.bytebuddy.implementation.InvokeDynamic;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author SimonWang
 * @Description Callable接口是一个泛型接口，可以返回指定类型的结果。
 * @create 2020-05-14 15:30
 */
public class FutureDemo {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(10);
        Future<String> future = service.submit(new Task());
        // 从Future获取异步执行返回的结果:
        String result = future.get(); // 可能阻塞
        System.out.println(result);
        service.shutdown();
    }
}
class Task implements Callable<String>{

    @Override
    public String call() throws Exception {
        return "success";
    }
}