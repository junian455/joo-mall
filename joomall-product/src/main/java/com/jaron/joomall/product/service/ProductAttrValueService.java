package com.jaron.joomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jaron.common.utils.PageUtils;
import com.jaron.joomall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-08 23:23:42
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

