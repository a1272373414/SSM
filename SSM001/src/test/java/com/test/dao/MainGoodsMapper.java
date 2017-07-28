package com.test.dao;

import com.test.pojo.MainGoods;

public interface MainGoodsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(MainGoods record);

    int insertSelective(MainGoods record);

    MainGoods selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(MainGoods record);

    int updateByPrimaryKey(MainGoods record);
}