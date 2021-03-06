package com.cloud.basic.bitOperate;

/**
 * @program: Basic
 * @description: 无符号右移 (>>>) 从高位移动至低位
 * @author: Cloud
 * @create: 2020/5/11 09:11:36
 */
public class rrr {

    // int(32) 转 byte(8)
    public static void main(String[] args) {
        int num = 7890;
        byte[] bytes = new byte[4];
        int shift = 3;
        for (int i = 0; i < 4; i++,shift--) {
            bytes[i] = (byte)((num>>>shift*8)&0xff);
            System.out.println(bytes[i]);
        }
    }
}
