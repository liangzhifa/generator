package com.zhifa.gdou.mapper;

import com.zhifa.gdou.model.WxImageInfo;

public interface WxImageInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WxImageInfo record);

    int insertSelective(WxImageInfo record);

    WxImageInfo selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WxImageInfo record);

    int updateByPrimaryKey(WxImageInfo record);
}