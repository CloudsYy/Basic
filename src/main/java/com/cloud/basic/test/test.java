package com.cloud.basic.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Basic
 * @description: 只是测试而已
 * @author: Cloud
 * @create: 2020/5/14 10:16:47
 */
public class test {

    /**
     * String字符串转成List<Long>数据格式
     * String str = "1,2,3,4,5,6" -> List<Long> listLong [1,2,3,4,5,6];
     * @param strArr
     * @return
     */
    public static List<Long> stringToLongList(String strArr) {
        return Arrays.stream(strArr.split(","))
                .map(s -> Long.parseLong(s.trim()))
                .collect(Collectors.toList());
    }

    // 这里表明了为什么在进制转换的时候需要加&0xff的计算,
    // 这里加&0xff和没加，前后两个的补码不一致，并且此时我们需要关
    // 注补码的一致性，并不需要关注十进制的数据，
    // 转成java的int的时候，对于原码，补码和反码需要去另外了解一下
    public static void main(String[] args) {
        String str1 = "123,456";
        List<Long> longList = stringToLongList(str1);
        Long a = longList.get(0);
        System.out.println(a);

        System.out.println(Integer.toBinaryString(-8&0xff));
        System.out.println(Integer.toBinaryString(-8));

        String str = "\"123\"";
        System.out.println(str);
        char c = str.charAt(str.length() - 1);
        System.out.println(c == '\"');
        int length = str.length();
        str=str.replace(str.charAt(str.length()-1)+"","\"");
        System.out.println(str);

        new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        };

        Runnable runnable = () -> System.out.println("hello world");

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> words = Arrays.asList(3, 4, 5);

        numbers.stream().filter(d -> d == 2).forEach(System.out::println);
   }
}
