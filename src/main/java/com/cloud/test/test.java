package com.cloud.test;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Properties;

public class test {

    public static void main(String[] args) {
        Properties pro = new Properties();

        try {
            pro.load(new FileInputStream("H:\\Program Files (x86)\\springbootproject\\Basic\\src\\main\\resources\\application-prod.properties"));

            for (Enumeration e = pro.propertyNames(); e.hasMoreElements();) {
                String s = (String) e.nextElement(); // 遍历所有元素
                if (s.equals("mysql.c3p[0].jdbcUrl")) {
                    /**如果键相同则覆盖*/
                    pro.setProperty("mysql.c3p[0].jdbcUrl", new Date().getTime() + "");
                } else {
                    /**否则就原样写入*/
                    pro.setProperty("123456", pro.getProperty(s));
                }
            }
            pro.store(new FileOutputStream("readxmllasttime.porperties"),"描述信息");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
