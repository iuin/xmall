package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.BaseCatalog2;
import com.dell.emc.xmall.mapper.BaseCatalog2Mapper;
import com.dell.emc.xmall.service.BaseCatalog2Service;

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
public class BaseCatalog2ServiceImpl extends ServiceImpl<BaseCatalog2Mapper, BaseCatalog2> implements BaseCatalog2Service {

    @Override
    public List<BaseCatalog2> findAllByCatalog1Id(Long catalog1Id) {
        return list(new QueryWrapper<BaseCatalog2>().eq("catalog1_id", catalog1Id));
    }
}
