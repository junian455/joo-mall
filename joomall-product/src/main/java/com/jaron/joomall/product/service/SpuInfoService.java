package com.jaron.joomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jaron.common.utils.PageUtils;
import com.jaron.joomall.product.entity.SpuInfoEntity;
import com.jaron.joomall.product.vo.SpuSaveVo;

import java.util.Map;

/**
 * spu信息
 *
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-10 23:11:16
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfo(SpuSaveVo vo);

    void saveBaseSpuInfo(SpuInfoEntity infoEntity);

    PageUtils queryPageByCondition(Map<String, Object> params);

    void up(Long spuId);

}

