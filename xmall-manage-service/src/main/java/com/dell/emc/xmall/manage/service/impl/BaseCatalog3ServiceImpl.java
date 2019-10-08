package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.BaseCatalog3;
import com.dell.emc.xmall.mapper.BaseCatalog3Mapper;
import com.dell.emc.xmall.service.BaseCatalog3Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class BaseCatalog3ServiceImpl extends ServiceImpl<BaseCatalog3Mapper, BaseCatalog3> implements BaseCatalog3Service {

    @Override
    public List<BaseCatalog3> findAllByCatalog2Id(Long catalog2Id) {
        return list(new QueryWrapper<BaseCatalog3>().eq("catalog2_id", catalog2Id));
    }
}
