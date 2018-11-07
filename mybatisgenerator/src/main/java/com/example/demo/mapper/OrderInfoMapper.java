package com.example.demo.mapper;

import com.example.demo.entity.OrderInfo;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(Integer orderPk);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(Integer orderPk);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}