package com.zhifa.gdou.mapper;

import com.zhifa.gdou.model.StidentInfoDetail;

public interface StidentInfoDetailMapper {
    int deleteByPrimaryKey(String studentnum);

    int insert(StidentInfoDetail record);

    int insertSelective(StidentInfoDetail record);

    StidentInfoDetail selectByPrimaryKey(String studentnum);

    int updateByPrimaryKeySelective(StidentInfoDetail record);

    int updateByPrimaryKey(StidentInfoDetail record);
}