package com.example.dao;

import com.example.model.System;

import java.util.List;

public interface SystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(System record);

    int insertSelective(System record);

    System selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(System record);

    int updateByPrimaryKey(System record);

    List<System> list();
}