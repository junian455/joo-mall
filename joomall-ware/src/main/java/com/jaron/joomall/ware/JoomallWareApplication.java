package com.jaron.joomall.ware;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@MapperScan(basePackages = "com.jaron.joomall.ware.dao")
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class JoomallWareApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(JoomallWareApplication.class, args);
    }
    
}
