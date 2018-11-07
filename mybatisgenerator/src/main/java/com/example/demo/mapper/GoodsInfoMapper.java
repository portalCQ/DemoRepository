package com.example.demo.mapper;

import com.example.demo.entity.GoodsInfo;
import com.example.demo.entity.GoodsInfoWithBLOBs;

public interface GoodsInfoMapper {
    int deleteByPrimaryKey(Integer goodsPk);

    int insert(GoodsInfoWithBLOBs record);

    int insertSelective(GoodsInfoWithBLOBs record);

    GoodsInfoWithBLOBs selectByPrimaryKey(Integer goodsPk);

    int updateByPrimaryKeySelective(GoodsInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(GoodsInfoWithBLOBs record);

    int updateByPrimaryKey(GoodsInfo record);
}