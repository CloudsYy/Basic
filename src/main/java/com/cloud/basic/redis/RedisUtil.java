package com.cloud.basic.redis;

import redis.clients.jedis.Jedis;
import java.io.InputStream;
import java.util.Properties;

/**
 * @program: Basic
 * @description:
 * @author: Cloud
 * @create: 2020/8/14 16:09:16
 */
public final class RedisUtil {

    public RedisUtil(){}

    private static Jedis jedisxuan;

    private static String host;

    private static String port;

    private static String password;

    private static String maxActive;

    private static String maxIdle;

    private static String maxWait;

    private static String testOnBorrow;

    static {
        // 加载Properties配置文件
        Properties properties = new Properties();
        InputStream is = RedisUtil.class.getClassLoader().getResourceAsStream("redis.properties");
    }
}
