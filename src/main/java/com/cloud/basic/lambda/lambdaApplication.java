package com.cloud.basic.lambda;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Basic
 * @description: lambda表示的应用场景，前面我们只是列过一种
 *                   表达式虽然简单，但在lambda表达式
 *                    中捕获异常也是需要优化的问题。
 * @author: Cloud
 * @create: 2020/7/7 09:16:53
 */
public class lambdaApplication {
    public static void main(String[] args) {
        //  2.列表迭代
        // list 循环
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer integer : list) {
            System.out.print(integer+" ");
        }
        System.out.println();

        // lambda表示式
        list.forEach(x-> System.out.print(x+" "));

        System.out.println();

        //如果只需要调用单个函数对列表元素进行处理，那么可以使用更加简洁的 方法引用 代替 Lambda 表达式：
        list.forEach(System.out::print);

        // 3.事件监听
        new JButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // handle the events
            }
        });

        // 这里主要体现为 比写匿名函数更简洁
        new JButton().addActionListener(e -> {
            // handle the events
        });

        // 4.代替 Runnable
        new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };

        Runnable runnable = () -> System.out.println("hello world");

        // 5.Map 映射
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> collect = list1.stream().map(x -> x * 2).collect(Collectors.toList());
        collect.forEach(System.out::println);

        // 6.Reduce 聚合
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        long start = System.currentTimeMillis();
        int sum = numbers.stream().reduce((x, y) -> x + y).get();
        long end = System.currentTimeMillis();
        System.out.println("总共花费："+(end-start));


        long start1 = System.currentTimeMillis();
        int result = 0;
        for (Integer number : numbers) {
            result+=number;
        }
        long end1 = System.currentTimeMillis();
        System.out.println("总共花费："+(end1-start1));

    }
}
