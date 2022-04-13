package com.jaron.joomall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jaron.common.utils.PageUtils;
import com.jaron.joomall.product.entity.SpuImagesEntity;

import java.util.List;
import java.util.Map;

/**
 * spu图片
 *
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-10 23:11:16
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveImages(Long id, List<String> images);
}

