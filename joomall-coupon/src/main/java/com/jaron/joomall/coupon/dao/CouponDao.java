package com.jaron.joomall.coupon.dao;

import com.jaron.joomall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-11 15:22:58
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
