package test;

import java.util.ArrayList;
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
     *
     * @param strArr
     * @return
     */
    public static List<Long> stringToLongList(String strArr) {
        return Arrays.stream(strArr.split(","))
                .map(s -> Long.parseLong(s.trim()))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String str = "123,456";
        List<Long> longList = stringToLongList(str);
        Long a = longList.get(0);
        System.out.println(a);
    }
}
