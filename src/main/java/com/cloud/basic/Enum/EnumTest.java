package com.cloud.basic.Enum;


import Enum.Food.Coffee;
import Enum.Food.Rabbit;

/**
 * @program: Basic
 * @description: 枚举
 * @author: Cloud
 * @create: 2020/7/21 14:31:54
 */
public class EnumTest {

    public static void main(String[] args) {
        String color = Color.BLACK.toString();
        System.out.println(color);


        Color red = Color.RED;
        switch (red){
            case RED:
                System.out.println("yes");
                break;
            case BLUE:
                System.out.println("no");
                break;
            default:
                break;
        }


        System.out.println(MyDay.MONDAY.getCode());
        System.out.println(MyDay.MONDAY.getName());
        System.out.println(MyDay.THUSDAY.getCode());
        System.out.println(MyDay.THUSDAY.getName());


        // 枚举实现接口
        System.out.println(MyDay.THUSDAY.getDay());

        for (Rabbit rabbit : Food.Rabbit.values()) {
            System.out.println(rabbit);
        }

        // 多态
        System.out.println("多态体现：");
        Food food = Rabbit.BLACK_CARROT;
        System.out.println(food);
        Food food1 = Coffee.BLACK_COFFEE;
        System.out.println(food1);

        // 同时，枚举类型对象之间的值比较，是可以使用==，直接来比较值，是否相等的，不是必须使用equals方法的
    }
}
