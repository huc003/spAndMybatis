package com.example.dao;

import com.example.model.DSystem;
import com.example.requestModel.DSystemRequestModel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SystemMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DSystemRequestModel record);

    int insertSelective(DSystemRequestModel record);

    DSystem selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DSystemRequestModel record);

    int updateByPrimaryKey(DSystemRequestModel record);

    int listCount();

    List<DSystem> list(@Param(value = "cond") DSystemRequestModel cond);
}