package com.jaron.joomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jaron.common.utils.PageUtils;
import com.jaron.joomall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-10 23:11:16
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}

