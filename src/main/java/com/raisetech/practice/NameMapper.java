package com.raisetech.practice;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface NameMapper {
    @Select("SELECT * FROM goods")
        //"SELECT * FROM names"にしてしまっていた
    List<Name> findAll();
}
