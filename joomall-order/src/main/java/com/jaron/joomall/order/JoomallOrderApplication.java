package com.jaron.joomall.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(basePackages = "com.jaron.joomall.order.dao")
@EnableDiscoveryClient
@EnableFeignClients
public class JoomallOrderApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(JoomallOrderApplication.class, args);
    }
    
}
