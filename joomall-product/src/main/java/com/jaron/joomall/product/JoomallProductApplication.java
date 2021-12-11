package com.jaron.joomall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.jaron.joomall.product.dao")
@SpringBootApplication
public class JoomallProductApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(JoomallProductApplication.class, args);
    }
    
}
