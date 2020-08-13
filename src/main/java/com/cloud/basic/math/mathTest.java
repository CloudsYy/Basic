package com.cloud.basic.math;

/**
 * @program: Basic
 * @description: math取余
 * @author: Cloud
 * @create: 2020/7/31 11:19:00
 */
public class mathTest {

    // 错误
    public static boolean oddorNot(int num){
        return num%2==1;
    }

    public static boolean oddorNot1(int num){
        return (num&1)!=0;
    }

    public static void main(String[] args) {
//        System.out.println(oddorNot(-1111111111));
//        System.out.println(oddorNot(1111111111));
        // 单双引号区别
        System.out.println("H"+"a");
        System.out.println('H'+'a');
    }
}
