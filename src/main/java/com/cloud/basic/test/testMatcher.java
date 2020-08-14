package com.cloud.basic.test;

/**
 * @program: Basic
 * @description:
 * @author: Cloud
 * @create: 2020/8/14 09:31:20
 */
public class testMatcher {

    public static void main(String[] args) {
        String str = "1_256.java";
        String newStr = str.replaceAll("_|.java","");
        System.out.println(newStr);
    }
}
