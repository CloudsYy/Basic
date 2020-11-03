package com.cloud.basic;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @program: Basic
 * @description:
 * @author: Cloud
 * @create: 2020/10/30 10:09:20
 */
public class Threadsssss {

    private static ExecutorService service = Executors.newCachedThreadPool();
    private static AtomicInteger a = new AtomicInteger(12);

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch count = new CountDownLatch(5000);
        for (int i = 0; i < 5000; i++) {
            service.execute(()->{
//                a++;
                a.incrementAndGet();
                count.countDown();
            });
        }
        count.await();
        service.shutdown();
        System.out.println("你好啊！："+a);
    }
}
