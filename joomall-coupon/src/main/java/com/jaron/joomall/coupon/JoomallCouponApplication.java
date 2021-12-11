package com.jaron.joomall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.jaron.joomall.coupon.dao")
@SpringBootApplication
public class JoomallCouponApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(JoomallCouponApplication.class, args);
    }
    
}
