package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.ProductImage;
import com.dell.emc.xmall.mapper.ProductImageMapper;
import com.dell.emc.xmall.service.ProductImageService;

/**
 * <p>
 * 商品图片表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class ProductImageServiceImpl extends ServiceImpl<ProductImageMapper, ProductImage> implements ProductImageService {

}
