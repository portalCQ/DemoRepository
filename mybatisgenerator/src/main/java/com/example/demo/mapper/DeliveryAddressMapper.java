package com.example.demo.mapper;

import com.example.demo.entity.DeliveryAddress;

public interface DeliveryAddressMapper {
    int deleteByPrimaryKey(Integer delivPk);

    int insert(DeliveryAddress record);

    int insertSelective(DeliveryAddress record);

    DeliveryAddress selectByPrimaryKey(Integer delivPk);

    int updateByPrimaryKeySelective(DeliveryAddress record);

    int updateByPrimaryKey(DeliveryAddress record);
}