package com.jaron.joomall.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@MapperScan(basePackages = "com.jaron.joomall.member.dao")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = "com.jaron.joomall.member.feign")
@SpringBootApplication
public class JoomallMemberApplication
{
    
    public static void main(String[] args)
    {
        SpringApplication.run(JoomallMemberApplication.class, args);
    }
    
}
