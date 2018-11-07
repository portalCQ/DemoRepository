package com.example.demo.mapper;

import com.example.demo.entity.UnionStaff;

public interface UnionStaffMapper {
    int deleteByPrimaryKey(Integer staffPk);

    int insert(UnionStaff record);

    int insertSelective(UnionStaff record);

    UnionStaff selectByPrimaryKey(Integer staffPk);

    int updateByPrimaryKeySelective(UnionStaff record);

    int updateByPrimaryKey(UnionStaff record);
}