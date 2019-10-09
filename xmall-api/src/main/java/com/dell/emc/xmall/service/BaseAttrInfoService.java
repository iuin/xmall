package com.dell.emc.xmall.service;

import com.dell.emc.xmall.entity.BaseAttrInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 属性表 服务类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
public interface BaseAttrInfoService extends IService<BaseAttrInfo> {
    public List<BaseAttrInfo> findAll(Long catalog3Id);
}
