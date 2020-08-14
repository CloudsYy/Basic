package com.cloud.basic.FileOperate;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * SqlServer
 * @author dolyw.com
 * @date 2019/4/5 17:53
 */
@Mapper
public interface UnDao {

    @Select("select name from sysobjects where type='U' or type = 'v'")
    public List<String> getColunms();

}
