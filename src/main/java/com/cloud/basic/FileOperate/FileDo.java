package com.cloud.basic.FileOperate;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @program: Basic
 * @description: 文件操作
 * @author: Cloud
 * @create: 2020/8/13 14:04:44
 */
public class FileDo {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        File file = new File("E:\\work\\outRoot\\java\\com\\erp\\entity");
        File[] files = file.listFiles();
        List<String> collect = Arrays.stream(files).map(File::getName).collect(Collectors.toList());

    }
}
