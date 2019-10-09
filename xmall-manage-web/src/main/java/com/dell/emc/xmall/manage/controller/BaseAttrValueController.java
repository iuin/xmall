package com.dell.emc.xmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dell.emc.xmall.entity.BaseAttrValue;
import com.dell.emc.xmall.service.BaseAttrValueService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 属性值表 前端控制器
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@RestController
@RequestMapping("/")
public class BaseAttrValueController {

    @Reference
    BaseAttrValueService attrValueService;

    @PostMapping("getAttrValueList")
    public List<BaseAttrValue> getAttrValues(Long attrId) {
        return attrValueService.findAll(attrId);
    }
}

