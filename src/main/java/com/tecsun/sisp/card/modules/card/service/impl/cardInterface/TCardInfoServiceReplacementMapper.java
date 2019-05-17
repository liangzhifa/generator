package com.tecsun.sisp.card.modules.card.service.impl.cardInterface;

import com.tecsun.sisp.card.modules.card.entity.response.TCardInfoServiceReplacement;

public interface TCardInfoServiceReplacementMapper {
    int deleteByPrimaryKey(String id);

    int insert(TCardInfoServiceReplacement record);

    int insertSelective(TCardInfoServiceReplacement record);

    TCardInfoServiceReplacement selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(TCardInfoServiceReplacement record);

    int updateByPrimaryKeyWithBLOBs(TCardInfoServiceReplacement record);

    int updateByPrimaryKey(TCardInfoServiceReplacement record);
}