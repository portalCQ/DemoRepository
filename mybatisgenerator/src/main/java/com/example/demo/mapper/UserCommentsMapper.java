package com.example.demo.mapper;

import com.example.demo.entity.UserComments;

public interface UserCommentsMapper {
    int deleteByPrimaryKey(Integer commPk);

    int insert(UserComments record);

    int insertSelective(UserComments record);

    UserComments selectByPrimaryKey(Integer commPk);

    int updateByPrimaryKeySelective(UserComments record);

    int updateByPrimaryKeyWithBLOBs(UserComments record);

    int updateByPrimaryKey(UserComments record);
}