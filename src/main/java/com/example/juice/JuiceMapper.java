package com.example.juice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface JuiceMapper {
    @Select("SELECT * FROM juices")
    List<Juice> findAll();
}
