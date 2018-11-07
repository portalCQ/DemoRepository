package com.example.demo.mapper;

import com.example.demo.entity.UnionNews;

public interface UnionNewsMapper {
    int deleteByPrimaryKey(Integer newsPk);

    int insert(UnionNews record);

    int insertSelective(UnionNews record);

    UnionNews selectByPrimaryKey(Integer newsPk);

    int updateByPrimaryKeySelective(UnionNews record);

    int updateByPrimaryKeyWithBLOBs(UnionNews record);

    int updateByPrimaryKey(UnionNews record);
}