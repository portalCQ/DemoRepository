package com.example.demo.mapper;

import com.example.demo.entity.UnionInfo;

public interface UnionInfoMapper {
    int deleteByPrimaryKey(Integer unionPk);

    int insert(UnionInfo record);

    int insertSelective(UnionInfo record);

    UnionInfo selectByPrimaryKey(Integer unionPk);

    int updateByPrimaryKeySelective(UnionInfo record);

    int updateByPrimaryKey(UnionInfo record);
}