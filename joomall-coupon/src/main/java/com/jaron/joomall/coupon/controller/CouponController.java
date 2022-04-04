package com.jaron.joomall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jaron.joomall.coupon.entity.CouponEntity;
import com.jaron.joomall.coupon.service.CouponService;
import com.jaron.common.utils.PageUtils;
import com.jaron.common.utils.R;


/**
 * 优惠券信息
 *
 * @author jaron
 * @email jaron@qq.com
 * @date 2021-12-11 15:22:58
 */
@RefreshScope
@RestController
@RequestMapping("coupon/coupon")
public class CouponController
{
    @Autowired
    private CouponService couponService;

    @Value("${coupon.user.name}")//从application.properties中获取//不要写user.name，他是环境里的变量
    private String name;
    @Value("${coupon.user.age}")
    private Integer age;
    @RequestMapping("/test")
    public R test(){

        return R.ok().put("name",name).put("age",age);
    }
    /**
     * 获取会员的优惠券
     *
     * @param
     * @return
     * @author huangjunjian
     **/
    @RequestMapping("/getmembercoupon")
    public R getMemberCoupon()
    {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("满100减20");
        
        return R.ok().put("coupons", Arrays.asList(couponEntity));
    }
    
    /**
     * 列表
     */
    @RequestMapping("/list")
    // @RequiresPermissions("coupon:coupon:list")
    public R list(@RequestParam Map<String, Object> params)
    {
        PageUtils page = couponService.queryPage(params);
        
        return R.ok().put("page", page);
    }
    
    
    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    // @RequiresPermissions("coupon:coupon:info")
    public R info(@PathVariable("id") Long id)
    {
        CouponEntity coupon = couponService.getById(id);
        
        return R.ok().put("coupon", coupon);
    }
    
    /**
     * 保存
     */
    @RequestMapping("/save")
    // @RequiresPermissions("coupon:coupon:save")
    public R save(@RequestBody CouponEntity coupon)
    {
        couponService.save(coupon);
        
        return R.ok();
    }
    
    /**
     * 修改
     */
    @RequestMapping("/update")
    // @RequiresPermissions("coupon:coupon:update")
    public R update(@RequestBody CouponEntity coupon)
    {
        couponService.updateById(coupon);
        
        return R.ok();
    }
    
    /**
     * 删除
     */
    @RequestMapping("/delete")
    // @RequiresPermissions("coupon:coupon:delete")
    public R delete(@RequestBody Long[] ids)
    {
        couponService.removeByIds(Arrays.asList(ids));
        
        return R.ok();
    }
    
}
