package com.jaron.joomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jaron.common.utils.PageUtils;
import com.jaron.joomall.product.entity.SpuInfoDescEntity;

import java.util.Map;

/**
 * spu信息介绍
 *
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-10 23:11:16
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveSpuInfoDesc(SpuInfoDescEntity descEntity);
}

