package com.jaron.joomall.ware.dao;

import com.jaron.joomall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-11 15:52:21
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {

    void addStock(Long skuId, Long wareId, Integer skuNum);

    Boolean getSkuStock(Long id);
}
