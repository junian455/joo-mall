package com.jaron.joomall.coupon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan(basePackages = "com.jaron.joomall.coupon.dao")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class JoomallCouponApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(JoomallCouponApplication.class, args);
    }
    
}
