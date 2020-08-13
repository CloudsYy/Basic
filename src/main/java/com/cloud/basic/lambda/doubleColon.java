package com.cloud.basic.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * @program: Basic
 * @description: 双冒号
 * @author: Cloud
 * @create: 2020/7/7 13:43:22
 */
interface Example {
    doubleColon print4();
}

interface Example1 {
    doubleColon1 print5(String name);
}

@FunctionalInterface
interface Example2<A, T> {
    T apply(A a);
}

class  superDoubleColon extends BaseExample{

    @Override
    public void print2(String content) {
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");

        // 3.超类方法语句
        // super::方法名
        list.forEach(super::print2);
    }
}

class BaseExample {
    public void print2(String content){
        System.out.println(content);
    }
}

class doubleColon1 {
    private String name;

    doubleColon1(String name){
        this.name = name;
    }

    public void test(){
        // 带参数类构造语句
        Example1 example1 = doubleColon1::new;
        doubleColon1 doubleColon1 = example1.print5("hello world!");
        System.out.println(doubleColon1.name);
    }

}

public class doubleColon {

    public static void print(String content){
        System.out.println(content);
    }

    public void print1(String content){
        System.out.println(content);
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("aaa","bbb","ccc","ddd");
        // 类::方法名
        // 1.静态方法语法
        list.forEach(doubleColon::print);

        // 实例:方法名
        // 2.实例方法语句
        list.forEach(new doubleColon()::print1);

        // 4.类构造器语句
        Example example = doubleColon::new;
        doubleColon doubleColon = example.print4();
        System.out.println(doubleColon);

        // 5. 数组构造语句
        Function<Integer,doubleColon[]> function = doubleColon[]::new;
        doubleColon[] apply = function.apply(4);

        Arrays.stream(apply).forEach(System.out::println);

        Example2<Integer,doubleColon[]> func = doubleColon[]::new;
        doubleColon[] apply1 = func.apply(4);
        Arrays.stream(apply1).forEach(System.out::println);

    }
}
