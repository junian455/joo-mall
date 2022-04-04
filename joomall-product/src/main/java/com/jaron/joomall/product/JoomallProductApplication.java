package com.jaron.joomall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCaching
@MapperScan(basePackages = "com.jaron.joomall.product.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.jaron.joomall.product.feign")
@SpringBootApplication
public class JoomallProductApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JoomallProductApplication.class, args);
    }
    
}
