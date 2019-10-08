package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.BaseCatalog1;
import com.dell.emc.xmall.mapper.BaseCatalog1Mapper;
import com.dell.emc.xmall.service.BaseCatalog1Service;

import java.util.List;

/**
 * <p>
 * 一级分类表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class BaseCatalog1ServiceImpl extends ServiceImpl<BaseCatalog1Mapper, BaseCatalog1> implements BaseCatalog1Service {


    @Override
    public List<BaseCatalog1> findAll() {
        return list(new QueryWrapper<>());
    }
}
