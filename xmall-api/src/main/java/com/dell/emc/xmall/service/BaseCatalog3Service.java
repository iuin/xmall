package com.dell.emc.xmall.service;

import com.dell.emc.xmall.entity.BaseCatalog3;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
public interface BaseCatalog3Service extends IService<BaseCatalog3> {
    List<BaseCatalog3> findAllByCatalog2Id(Long catalog2Id);
}
