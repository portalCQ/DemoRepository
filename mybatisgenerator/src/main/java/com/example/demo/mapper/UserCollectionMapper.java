package com.example.demo.mapper;

import com.example.demo.entity.UserCollection;

public interface UserCollectionMapper {
    int deleteByPrimaryKey(Integer collectPk);

    int insert(UserCollection record);

    int insertSelective(UserCollection record);

    UserCollection selectByPrimaryKey(Integer collectPk);

    int updateByPrimaryKeySelective(UserCollection record);

    int updateByPrimaryKey(UserCollection record);
}