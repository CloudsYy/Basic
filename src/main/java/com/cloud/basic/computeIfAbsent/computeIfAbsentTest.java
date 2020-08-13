package com.cloud.basic.computeIfAbsent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Basic
 * @description: Map，Java8的新特性
 * Map接口的实现类如HashMap,ConcurrentHashMap,HashTable等继承了此方法，
 * 通过此方法可以构建JAVA本地缓存，降低程序的计算量，程序的复杂度，使代码简洁，易懂。
 * 此方法首先判断缓存MAP中是否存在指定key的值，如果不存在，会自动调用mappingFunction(key)计算key的value，
 * 然后将key = value放入到缓存Map,java8会使用thread-safe的方式从cache中存取记录。
 * 如果mappingFunction(key)返回的值为null或抛出异常，则不会有记录存入map
 * @author: Cloud
 * @create: 2020/7/31 16:09:26
 */
public class computeIfAbsentTest {

    public static void main(String[] args) {
        List<String> list = null;
        Map<String, Object> map = new HashMap<>();
        // 第一种方法 1.8之前
//        if (map.get("list")==null) {
//            list = new ArrayList<>();
//        }
//        map.put("aa", list);

        // 第二种方法 1.8之后
        map.computeIfAbsent("list",k -> new ArrayList<>());


        map.put("name",null);
        map.computeIfAbsent("name", k-> "张三");
        map.computeIfAbsent("age", k->2);
        map.computeIfAbsent("name",k->"李四");

        map.put("hobby","打篮球");
        // putIfAbsent key存在则不替换，不存在则直接再调用put
        map.putIfAbsent("hobby","打羽毛球");


    }
}
