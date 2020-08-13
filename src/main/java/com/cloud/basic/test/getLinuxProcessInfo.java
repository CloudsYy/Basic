package com.cloud.basic.test;

import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: ControlLinuxProcess
 * @description: 获取linux进程信息
 * @author: Cloud
 * @create: 2020/7/23 14:51:29
 */
@Component
public class getLinuxProcessInfo{
    public static void run(String shell) throws IOException {
        Process process = Runtime.getRuntime().exec(shell);
        BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String tmp;
        while((tmp=br.readLine())!=null){
            sb.append(tmp).append("\n");
        }
        System.out.println(process);
        System.out.println(sb.toString());
    }
}
