package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: Basic
 * @description:
 * @author: Cloud
 * @create: 2020/7/15 14:21:43
 */
public class TestForeach {

    public static void main(String[] args) {
        Student student = new Student();
        student.setAge(1);
        student.setId("123");
        student.setName("宁瑶");
        student.setSex(2);
        Student student1 = new Student();
        student1.setAge(1);
        student1.setId("123");
        student1.setName("张三");
        student1.setSex(1);
        Student student2 = new Student();
        student2.setAge(1);
        student2.setId("123");
        student2.setName("李四");
        student2.setSex(1);
        Student student3 = new Student();
        student3.setAge(1);
        student3.setId("123");
        student3.setName("王五");
        student3.setSex(1);
        List<Student> list = new ArrayList<Student>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        list.add(student3);
        Map<String, List<Student>> items = new HashMap<>();
        items.put("A", list);

        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v.size());
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });
    }
}
