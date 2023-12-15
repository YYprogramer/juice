package com.example.juice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JuiceMapper {
    @Select("SELECT * FROM juices")
    List<Juice> findAll();
}
