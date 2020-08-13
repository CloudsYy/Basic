package com.cloud.basic.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Basic
 * @description: 使用stream.filter过滤一个list列表
 * @author: Cloud
 * @create: 2020/7/9 09:31:02
 */
public class testStream {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        Student student = new Student();
        student.setAge(14);
        student.setName("宁瑶");
        student.setId("123");
        student.setSex(2);
        Student student1 = new Student();
        student1.setAge(15);
        student1.setName("宁瑶1");
        student1.setId("123");
        student1.setSex(2);
        Student student2 = new Student();
        student2.setAge(16);
        student2.setName("宁瑶2");
        student2.setId("123");
        student2.setSex(2);
        Student student3 = new Student();
        student3.setAge(20);
        student3.setName("宁瑶3");
        student3.setId("123");
        student3.setSex(2);
        list = Arrays.asList(student, student1, student2, student3);

        List<Integer> ages = Arrays.asList(20);
        // 一个list过滤另一个ages列表中的内容，若想不包含ages列表中的内容则在后面加个!，包含则不加.
        List<Student> collect = list.stream().filter(Student -> !ages.contains(Student.getAge())).collect(Collectors.toList());
        System.out.println(collect);

    }
}
