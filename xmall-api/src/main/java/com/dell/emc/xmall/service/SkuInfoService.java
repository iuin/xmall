package com.dell.emc.xmall.service;

import com.dell.emc.xmall.entity.SkuInfo;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 库存单元表 服务类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
public interface SkuInfoService extends IService<SkuInfo> {
    List<SkuInfo> findAll(Long catalog3Id);
}
