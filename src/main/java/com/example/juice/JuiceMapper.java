package com.example.juice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface JuiceMapper {
    @Select("SELECT * FROM juices")
    List<Juice> findAll();
    @Select("SELECT * FROM juices WHERE name LIKE CONCAT(#{prefix}, '%') AND name LIKE CONCAT('%',#{suffix}) AND name LIKE CONCAT('%',#{contains},'%')")
    List<Juice> findByNameStartingWith(String prefix, String suffix, String contains);
}
