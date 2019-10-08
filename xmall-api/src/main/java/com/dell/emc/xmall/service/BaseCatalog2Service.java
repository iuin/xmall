package com.dell.emc.xmall.service;

import com.dell.emc.xmall.entity.BaseCatalog2;
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
public interface BaseCatalog2Service extends IService<BaseCatalog2> {
    List<BaseCatalog2> findAllByCatalog1Id(Long catalog1Id);
}
