package com.dell.emc.xmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dell.emc.xmall.entity.BaseCatalog1;
import com.dell.emc.xmall.entity.BaseCatalog2;
import com.dell.emc.xmall.entity.BaseCatalog3;
import com.dell.emc.xmall.service.BaseCatalog1Service;
import com.dell.emc.xmall.service.BaseCatalog2Service;
import com.dell.emc.xmall.service.BaseCatalog3Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 一级分类表 前端控制器
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@RestController
@RequestMapping("/")
public class CatalogController {

    @Reference
    BaseCatalog1Service catalog1Service;

    @Reference
    BaseCatalog2Service catalog2Service;

    @Reference
    BaseCatalog3Service catalog3Service;

    @PostMapping("getCatalog1")
    public List<BaseCatalog1> getCatalog1() {
        List<BaseCatalog1> all = catalog1Service.findAll();
        return all;
    }

    @PostMapping("getCatalog2")
    public List<BaseCatalog2> getCatalog2(Long catalog1Id) {
        List<BaseCatalog2> all = catalog2Service.findAllByCatalog1Id(catalog1Id);
        return all;
    }

    @PostMapping("getCatalog3")
    public List<BaseCatalog3> getCatalog3(Long catalog2Id) {
        List<BaseCatalog3> all = catalog3Service.findAllByCatalog2Id(catalog2Id);
        return all;
    }
}

