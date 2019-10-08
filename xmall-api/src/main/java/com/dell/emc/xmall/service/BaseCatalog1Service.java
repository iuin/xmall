package com.dell.emc.xmall.service;

import com.dell.emc.xmall.entity.BaseCatalog1;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 一级分类表 服务类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
public interface BaseCatalog1Service extends IService<BaseCatalog1> {
    public List<BaseCatalog1> findAll();
}
