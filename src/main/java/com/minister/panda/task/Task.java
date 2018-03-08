package com.minister.panda.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.Random;
import java.util.concurrent.Future;

/**
 * @Description
 * @Email lq@zhiduntech.com
 * @Author lq-t133
 * @Date 2018/3/8
 */

@Component
public class Task {
    public static Random random = new Random();

    /**
     * @Async 异步执行
     * @throws Exception
     */
    @Async
    public void doTaskOne() throws Exception {
        System.out.println("开始做任务一");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务一，耗时：" + (end - start) + "毫秒");
    }

    @Async
    public void doTaskTwo() throws Exception {
        System.out.println("开始做任务二");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务二，耗时：" + (end - start) + "毫秒");
    }

    @Async
    public void doTaskThree() throws Exception {
        System.out.println("开始做任务三");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务三，耗时：" + (end - start) + "毫秒");
    }

    @Async
    public Future<String> doTaskFour() throws Exception {
        System.out.println("开始做任务4");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务4，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务4完成");
    }

    @Async
    public Future<String> doTaskFive() throws Exception {
        System.out.println("开始做任务5");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务5，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务5完成");
    }

    @Async
    public Future<String> doTaskSix() throws Exception {
        System.out.println("开始做任务6");
        long start = System.currentTimeMillis();
        Thread.sleep(random.nextInt(10000));
        long end = System.currentTimeMillis();
        System.out.println("完成任务6，耗时：" + (end - start) + "毫秒");
        return new AsyncResult<>("任务6完成");
    }
}
