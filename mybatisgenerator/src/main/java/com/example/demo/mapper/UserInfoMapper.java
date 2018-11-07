package com.example.demo.mapper;

import com.example.demo.entity.UserInfo;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer userPk);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(Integer userPk);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}