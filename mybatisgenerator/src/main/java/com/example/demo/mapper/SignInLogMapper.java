package com.example.demo.mapper;

import com.example.demo.entity.SignInLog;

public interface SignInLogMapper {
    int deleteByPrimaryKey(Integer signinPk);

    int insert(SignInLog record);

    int insertSelective(SignInLog record);

    SignInLog selectByPrimaryKey(Integer signinPk);

    int updateByPrimaryKeySelective(SignInLog record);

    int updateByPrimaryKey(SignInLog record);
}