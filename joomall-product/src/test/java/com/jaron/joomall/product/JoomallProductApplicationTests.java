package com.jaron.joomall.product;

import com.aliyun.oss.OSSClient;
import com.jaron.joomall.product.entity.BrandEntity;
import com.jaron.joomall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@SpringBootTest
class JoomallProductApplicationTests
{
    @Autowired
    private BrandService brandService;

    @Test
    void contextLoads()
    {
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setBrandId(1L);
        brandEntity.setName("华为");
        brandService.updateById(brandEntity);
        
        
        // brandEntity.setName("hjj品牌");
        // brandEntity.setLogo("hjj标志");
        // brandEntity.setDescript("hjj描述");
        // brandEntity.setShowStatus(0);
        // brandEntity.setSort(0);
        // brandService.save(brandEntity);
        // System.out.println("保存成功");
    }




}
