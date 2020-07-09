package lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Basic
 * @description: java 新特性stream的各个用法
 * @author: Cloud
 * @create: 2020/7/7 15:33:20
 */
public class stream {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 7, 6, 8, 9);

        // 根据条件过滤
        System.out.println("根据条件过滤");
        list.stream().filter(a -> 5 < a).forEach(System.out::println);
        // 聚合
        System.out.println("聚合运算");
        int sum = list.stream().reduce((x, y) -> x + y).get();
        System.out.println(sum);
        // 映射map
        System.out.println("映射map");
        list.stream().map(x -> x * 2).forEach(System.out::println);
        // 去重
        System.out.println("去重");
        list.stream().distinct().forEach(System.out::println);
        // 过滤n个元素
        System.out.println("过滤n个元素");
        list.stream().skip(2).forEach(System.out::println);
        // 排序
        System.out.println("排序");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("乱序");
        list.stream().unordered().forEach(System.out::println);
        System.out.println("倒序");
        list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // 加入收集器
        System.out.println("collect count");
        long count = list.stream().count();
        System.out.println(sum);

        System.out.println("max和min的使用");
        Integer integer = list.stream().max((o1, o2) -> o2 - o1).get();
        Integer integer1 = list.stream().min((o1, o2) -> o2 - o1).get();
        System.out.println(integer);
        System.out.println(integer1);

        // anyMatch操作用于判断Stream中的是否有满足指定条件的元素。如果最少有一个满足条件返回true，否则返回false，all和none可推导出其结果
        System.out.println("any, all, none的使用");
        boolean b = list.stream().anyMatch(integer2 -> integer2 > 4);
        System.out.println(b);
        boolean c = list.stream().allMatch(integer2 -> integer2 > 4);
        System.out.println(c);
        boolean d = list.stream().noneMatch(integer2 -> integer2 > 4);
        System.out.println(d);

        System.out.println("limit 的使用");
        list.stream().limit(2).forEach(System.out::println);

    }
}
