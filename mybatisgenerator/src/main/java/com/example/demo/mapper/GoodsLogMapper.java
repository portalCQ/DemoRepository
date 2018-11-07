package com.example.demo.mapper;

import com.example.demo.entity.GoodsLog;

public interface GoodsLogMapper {
    int deleteByPrimaryKey(Integer glPk);

    int insert(GoodsLog record);

    int insertSelective(GoodsLog record);

    GoodsLog selectByPrimaryKey(Integer glPk);

    int updateByPrimaryKeySelective(GoodsLog record);

    int updateByPrimaryKey(GoodsLog record);
}