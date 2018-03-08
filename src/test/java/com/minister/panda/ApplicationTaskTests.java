package com.minister.panda;

import com.minister.panda.task.Task;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.Future;

/**
 * @Description
 * @Email lq@zhiduntech.com
 * @Author lq-t133
 * @Date 2018/3/8
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTaskTests {
    @Autowired
    private Task task;

    @Test
    public void test() throws Exception{
//        task.doTaskOne();
//        task.doTaskTwo();
//        task.doTaskThree();
        /**
         * 不加如下代码的话，执行耗时情况不能打印出，因为异步执行时，
         * 主程序不会管其他的函数是否执行完成，自己执行完成就结束了，
         * 所以导致打印的内容不完整或者没输出
         */
        //Thread.sleep(10000);



        long start = System.currentTimeMillis();
        Future<String> task1 = task.doTaskFour();
        Future<String> task2 = task.doTaskFive();
        Future<String> task3 = task.doTaskSix();
        while(true) {
            if(task1.isDone() && task2.isDone() && task3.isDone()) {
                // 三个任务都调用完成，退出循环等待
                break;
            }
            Thread.sleep(1000);
        }
        long end = System.currentTimeMillis();
        System.out.println("任务全部完成，总耗时：" + (end - start) + "毫秒");
    }
}
