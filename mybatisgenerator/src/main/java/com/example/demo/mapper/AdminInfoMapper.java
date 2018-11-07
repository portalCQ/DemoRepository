package com.example.demo.mapper;

import com.example.demo.entity.AdminInfo;

public interface AdminInfoMapper {
    int deleteByPrimaryKey(Integer adminPk);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    AdminInfo selectByPrimaryKey(Integer adminPk);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);
}