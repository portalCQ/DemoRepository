package com.example.demo.mapper;

import com.example.demo.entity.UnionGoodsInfo;
import com.example.demo.entity.UnionGoodsInfoKey;

public interface UnionGoodsInfoMapper {
    int deleteByPrimaryKey(UnionGoodsInfoKey key);

    int insert(UnionGoodsInfo record);

    int insertSelective(UnionGoodsInfo record);

    UnionGoodsInfo selectByPrimaryKey(UnionGoodsInfoKey key);

    int updateByPrimaryKeySelective(UnionGoodsInfo record);

    int updateByPrimaryKey(UnionGoodsInfo record);
}