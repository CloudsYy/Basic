package com.cloud.basic.Enum;

/**
 * @program: Basic
 * @description: 使用接口组织枚举
 * @author: Cloud
 * @create: 2020/7/21 15:07:35
 */
public interface Food {
    enum Coffee implements Food{
        BLACK_COFFEE,BULE_COFFEE,WHITE_COFFEE
    }
    enum Rabbit implements Food{
        BLACK_CARROT,BLUE_CARROT,WHITE_CARROT
    }
}
