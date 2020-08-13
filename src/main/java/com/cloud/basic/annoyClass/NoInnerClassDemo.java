package com.cloud.basic.annoyClass;

/**
 * @program: Basic
 * @description: 匿名内部类的使用
 * @author: Cloud
 * @create: 2020/6/9 14:10:04
 */

interface B {
    public void printInfo(int a, int b);
}

class A implements B{
    @Override
    public void printInfo(int a, int b) {
        System.out.println("这里是非匿名内部类 "+a+b);
    }
}

class X{
    public void run1(){
        this.run2(new A());
    }
    public void run2(A a){
        a.printInfo(1,2);
    }
}

public class NoInnerClassDemo {
    public static void main(String[] args) {
        new X().run1();
    }
}
