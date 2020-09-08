package com.cloud.basic.Advance.Design;

import java.io.Serializable;

/**
 * @program: Basic
 * @description: 串行化单例
 * @author: Cloud
 * @create: 2020/9/5 09:53:43
 */
public class Singleton implements Serializable {

    String name;

    private Singleton(){
        System.out.println("singleton is instancing");
        name = "zhougong";
    }

    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }

    public static void creatingSingleton(){
        System.out.println("singleton is creating");
    }

    private Object readSolve(){ // 总是阻止新的实例的产生，返回当前的实例
        return singleton;
    }
}
