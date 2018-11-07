package com.example.demo.mapper;

import com.example.demo.entity.CartInfo;

public interface CartInfoMapper {
    int deleteByPrimaryKey(Integer cartPk);

    int insert(CartInfo record);

    int insertSelective(CartInfo record);

    CartInfo selectByPrimaryKey(Integer cartPk);

    int updateByPrimaryKeySelective(CartInfo record);

    int updateByPrimaryKey(CartInfo record);
}