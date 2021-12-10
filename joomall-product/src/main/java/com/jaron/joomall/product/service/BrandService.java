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
 * @date 2021-12-08 23:23:42
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

