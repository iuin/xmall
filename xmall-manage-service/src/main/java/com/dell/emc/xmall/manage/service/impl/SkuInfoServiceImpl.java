package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.SkuInfo;
import com.dell.emc.xmall.mapper.SkuInfoMapper;
import com.dell.emc.xmall.service.SkuInfoService;

import java.util.List;

/**
 * <p>
 * 库存单元表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class SkuInfoServiceImpl extends ServiceImpl<SkuInfoMapper, SkuInfo> implements SkuInfoService {

    @Override
    public List<SkuInfo> findAll(Long catalog3Id) {
        return list(new QueryWrapper<SkuInfo>().eq("catalog3_id", catalog3Id));
    }
}
