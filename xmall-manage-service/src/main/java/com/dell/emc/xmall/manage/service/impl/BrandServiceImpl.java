package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.Brand;
import com.dell.emc.xmall.mapper.BrandMapper;
import com.dell.emc.xmall.service.BrandService;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class BrandServiceImpl extends ServiceImpl<BrandMapper, Brand> implements BrandService {

}
