package com.jaron.joomall.product.dao;

import com.jaron.joomall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-08 23:23:42
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
