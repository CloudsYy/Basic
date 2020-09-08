package com.cloud.basic.test;

/**
 * @program: Basic
 * @description: 测试for循环
 * @author: Cloud
 * @create: 2020/9/4 14:44:53
 */
public class testFor {

    public static void main(String[] args) {
        String[] strings = new String[10];
        long startTime = System.nanoTime();
        for (int i = 0; i < strings.length; ) {
            i++;
//            System.nanoTime()-startTime = 182200
        }
//        System.nanoTime()-startTime = 109100
        for (int i = 0; i < 10; ) {
            i++;
        }
        // System.nanoTime()-startTime = 15700
        System.out.println("System.nanoTime()-startTime = " + (System.nanoTime() - startTime));

    }
}
