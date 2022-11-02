package com.example.ex01.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface TimeMapper {
    public String getTime();
    @Select("SELECT SYSDATE FROM DUAL")
    public String getTimeQuick();
}
