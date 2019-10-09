package com.dell.emc.xmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dell.emc.xmall.entity.BaseAttrInfo;
import com.dell.emc.xmall.mapper.BaseAttrInfoMapper;
import com.dell.emc.xmall.service.BaseAttrInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 属性表 前端控制器
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@RestController
@RequestMapping("/")
public class BaseAttrInfoController {

    @Reference
    BaseAttrInfoService attrInfoService;

    @GetMapping("attrInfoList")
    public List<BaseAttrInfo> getAttrInfoList(Long catalog3Id) {
        return attrInfoService.findAll(catalog3Id);
    }
}

