package com.cloud.basic.test;

import joinery.DataFrame;

import java.util.Arrays;

/**
 * @program: basicspringboot
 * @description: JoineryDemo
 * @author: Cloud
 * @create: 2020/6/24 16:18:57
 */
public class JoineryTest {

    public static void main(String[] args) {
        DataFrame<Object> df = new DataFrame<>("name","value");
        DataFrame<Object> df1 = new DataFrame<>("name","value","value1","value2","value3");
        df.append(Arrays.asList("alpha",456));
        df.append(Arrays.asList("bravo",123));
        df.append(Arrays.asList("omega",789));
        df.append(Arrays.asList("omega1",789));

        df1.append(Arrays.asList("alpha",456,456,123,47));
        System.out.println(df.size());
        System.out.println(df.length());
        System.out.println(df.flatten());
        System.out.println(df.mean().col("value"));
        System.out.println(df.median().col("value"));
        System.out.println(df.max().col("value"));
        System.out.println(df.min().col("value"));
        DataFrame<Object> head = df.head(1);
        System.out.println(df1.unique());
    }
}
