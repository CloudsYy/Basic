package com.cloud.basic.guava;

import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.*;

import java.util.*;

/**
 * @program: Basic
 * @description: Joiner/Splitter/CharMatcher的使用
 * @author: Cloud
 * @create: 2020/8/6 10:08:41
 */
public class JSCGuava {

    // 连接器
    private static final Joiner joiner = Joiner.on(",").skipNulls();

    // 分割器
    private static final Splitter splitter = Splitter.on(",").trimResults().omitEmptyStrings();

    public static void main(String[] args) {
        // 把集合/数组中的元素join在一起
        String join = joiner.join(Lists.newArrayList("a", null, "b"));
        System.out.println("join= "+ join);

        String str = " a,   ,b,,";
        String[] split = str.split(",");
        System.out.println(split[1]);
        for (String temp : splitter.split(" a,   ,b,,")) {
            System.out.println(temp);
        }

        // 普通Collection
        List<String> list = Lists.newArrayList();
        HashSet<String> objects = Sets.newHashSet();
        Map<Object, Object> map = Maps.newHashMap();

        /*
        * 在多线程操作下，是线程安全的
          所有不可变集合会比可变集合更有效的利用资源
          中途不可改变
        * */
        // 不变Collection
        ImmutableList immutableList = ImmutableList.of("a","b","c");
        ImmutableSet immutableSet = ImmutableSet.of("a","b","c");
        ImmutableMap<String,String> iMap = ImmutableMap.of("a","b","c","d");

        // 以前我们需要Map里面装一个list需要这样创建
        Map<String,Object> map1 = new HashMap();
        List<Integer> inList = new ArrayList<>();
        inList.add(2);
        inList.add(21);
        map1.put("aa",inList);
        System.out.println(map1.get("aa"));

        // now
        Multimap<String, Integer> multimap = ArrayListMultimap.create();
        multimap.put("aa",2);
        multimap.put("aa",21);
        System.out.println(multimap.get("aa"));

        // previous (list转字符串新增规则)
        List<String> arrayList = new ArrayList<>();
        arrayList.add("xiao");
        arrayList.add("ai");
        arrayList.add("zhen");
        arrayList.add("yong");
        arrayList.add("gan!");
        String result = "";
        for (String s : arrayList) {
            result+=s+" ";
        }
        System.out.println(result);

        // now
        List<String> arrayList1 = new ArrayList<>();
        arrayList1.add("xiao");
        arrayList1.add("ai");
        arrayList1.add("zhen");
        arrayList1.add("yong");
        arrayList1.add("gan!");
        String result1 = Joiner.on(" ").join(arrayList1);
        System.out.println(result1);

        // 把map集合转换为特定规则的字符串
        Map<String, String> hashMap = Maps.newHashMap();
        hashMap.put("name","xiaoai");
        hashMap.put("sex","female");
        String result3 = Joiner.on(",").withKeyValueSeparator("=").join(hashMap);
        System.out.println(result3);

        // 将String转换为特定的集合
        //use java
        List<String> list3 = new ArrayList<String>();
        String a = "1-2-3-4-5-6";
        String[] strs = a.split("-");
        for(int i=0; i<strs.length; i++){
            list.add(strs[i]);
        }

        //use guava
        String str2 = "1-2-3-4-5-6";
        List<String> list4 = Splitter.on("-").splitToList(str2);

        //guava还可以使用 omitEmptyStrings().trimResults() 去除空串与空格
        String str3 = "1- 2-3";
        List<String> list5 = Splitter.on("-").omitEmptyStrings().trimResults().splitToList(str3);

        //  真的牛这个！！！
        String input = "aa.dd,,ff,,.";
        List<String> result6 = Splitter.onPattern("[.|,]").omitEmptyStrings().splitToList(input);

        // 判断匹配结果
        boolean matches = CharMatcher.inRange('a', 'z').or(CharMatcher.inRange('A', 'Z')).matches('K');
        String s = CharMatcher.inRange('0', '9').retainFrom("abc 123 efg");
        String s1 = CharMatcher.inRange('0', '9').removeFrom("abc 123 efg");
        System.out.println(matches);
        System.out.println(s);
        System.out.println(s1);

        Set setA = Sets.newHashSet(1, 2, 3, 4, 5);
        Set setB = Sets.newHashSet(4, 5, 6, 7, 8);

        // 这几个方法超牛的...
        // 并集
        Sets.union(setA,setB).forEach(System.out::print);
        System.out.println();

        // 差集
        Sets.difference(setA,setB).forEach(System.out::print);
        System.out.println();

        // 交集
        Sets.intersection(setA,setB).forEach(System.out::print);
        System.out.println();

        HashMap<String, Integer> mapA = Maps.newHashMap();
        mapA.put("a", 1);mapA.put("b", 2);mapA.put("c", 3);

        HashMap<String, Integer> mapB = Maps.newHashMap();
        mapB.put("b", 20);mapB.put("c", 3);mapB.put("d", 4);
        MapDifference<String, Integer> difference = Maps.difference(mapA, mapB);
        boolean b = difference.areEqual();
        System.out.println(b);
        Map map01 = difference.entriesDiffering();
        Map map02 = difference.entriesOnlyOnLeft();
        Map map03 = difference.entriesInCommon();
        Map map04 = difference.entriesOnlyOnRight();

        System.out.println(map01);
        System.out.println(map02);
        System.out.println(map03);
        System.out.println(map04);
    }
}
