package com.dell.emc.xmall.manage.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.dell.emc.xmall.entity.BaseAttrInfo;
import com.dell.emc.xmall.service.BaseAttrInfoService;
import com.dell.emc.xmall.vo.AttrInfoVO;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("saveAttrInfo")
    public String saveAttrInfo(@RequestBody AttrInfoVO attrInfoVO) {
        System.out.println(attrInfoVO);
        boolean success = attrInfoService.saveAttrInfo(attrInfoVO);
        if(success) {
            return "success";
        } else {
            return "error";
        }
    }
}

