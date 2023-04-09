package com.ljc.guli.product;

import com.ljc.guli.product.entity.BrandEntity;
import com.ljc.guli.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GuliProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        BrandEntity brandEntity = new BrandEntity();

        brandEntity.setName("ljc");
        brandService.save(brandEntity);
        System.out.println("保存成功");
    }

}
