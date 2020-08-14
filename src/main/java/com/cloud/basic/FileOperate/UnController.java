package com.cloud.basic.FileOperate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

/**
 * @program: ViewGenerator
 * @description: 查询数据库所有的表和已经生成实体类的文件进行对比(通过文件名)，看是否有遗漏
 * @author: Cloud
 * @create: 2020/8/13 17:10:51
 */
@RestController
@RequestMapping("/data/")
public class UnController {

    @Autowired
    private UnDao unDao;

    @GetMapping("getColumns")
    public List<String> getColumns(){
        // 指定数据库中的所有表名(有大小写下划线)
        List<String> colunms = unDao.getColunms();
        List<String> list = new ArrayList<>();
        colunms.forEach(x->list.add(x.replaceAll("_","").toUpperCase()));

        File file = new File("E:\\work\\outRoot\\java\\com\\erp\\entity");
        File[] files = file.listFiles();
        // 文件名集合
        List<String> collect = Arrays.stream(files).map(File::getName).collect(Collectors.toList());
        List<String> newList = new ArrayList<>();
        collect.forEach(x->newList.add(x.replaceAll(".java","").toUpperCase()));

        // 比对结果
        List<String> collect1 = list.stream().filter(a -> !newList.contains(a)).collect(Collectors.toList());
        return collect1;
    }
}
