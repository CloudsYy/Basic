package com.cloud.basic.test;

import lombok.SneakyThrows;

/**
 * @program: ControlLinuxProcess
 * @description:
 * @author: Cloud
 * @create: 2020/7/23 15:04:04
 */
public class ProcessTest implements Runnable {
    @SneakyThrows
    @Override
    public void run() {
        getLinuxProcessInfo info = new getLinuxProcessInfo();
        ExecShellCommand command = new ExecShellCommand();
        for (int i = 0; i < 10; i++) {
//            info.run("top");
            System.out.println(command.execCmd("ps -ef",null));
//            System.out.println(command.execCmd("docker ps -a",null));
            System.out.println(Thread.currentThread().getName() + "-->" + i);

            //休眠一秒钟
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
