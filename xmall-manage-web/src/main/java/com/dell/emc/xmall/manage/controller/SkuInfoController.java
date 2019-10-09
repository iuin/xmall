package com.dell.emc.xmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dell.emc.xmall.entity.SkuInfo;
import com.dell.emc.xmall.service.SkuInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 库存单元表 前端控制器
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@RestController
@RequestMapping("/")
public class SkuInfoController {

    @Reference
    SkuInfoService skuInfoService;

    @GetMapping("spuList")
    public List<SkuInfo> getSkuList(Long catalog3Id) {
        return skuInfoService.findAll(catalog3Id);
    }
}

