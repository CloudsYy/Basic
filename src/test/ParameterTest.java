package test;

import jdk.nashorn.internal.ir.annotations.Immutable;

import java.util.*;

/**
 * @program: Basic
 * @description: 变量区别
 * 	            成员变量	          局部变量	               静态变量
 *  定义位置	    类中方法外	    方法中或方法形参	           类中方法外
 *  初始化值	    有默认初始化值	无，先定义，赋值后使用	   有默认初始化值
 *  调用方式	    对象调用	    	    /                      对象调用、类名调用
 *  存储位置	    堆区	           栈区	                   方法区
 *  生命周期	    与对象共存亡	    与方法共存亡	               与类共存亡
 *  别名	    实例变量	    	     /                     类变量
 * @author: Cloud
 * @create: 2020/8/1 09:01:19
 */
public class ParameterTest {

    public static void main(String[] args) {
        Set<String> userIdSet = new HashSet<>();
        List<String> userVOList = new ArrayList<>();
        List list = new ArrayList<>();
        // 一、这样写太冗余，且多次赋值印象性能，因减少多次赋值的操作
        userVOList.add("123");
        userVOList.add("123");
        userVOList.add("456");
        userVOList.add("789");
        userVOList.add("753");

        // 二、
        userVOList = Arrays.asList("123","123","456","789","753");

        // 简化数据拷贝  使用beanUtils.copyProperties  浅拷贝
//        List<Student> studentList = new ArrayList<Student>();
//        BeanUtils.copyProperties(userDO, userVO)

        for (String userDO : userVOList) { // set去重
//            if (!userIdSet.contains(userDO)) {
//                userIdSet.add(userDO);
//            }
            if (userIdSet.add(userDO)) {
                list.add(userDO);
            }
        }

        // if-else 数组简化和map简化，switch简化


    }
}
