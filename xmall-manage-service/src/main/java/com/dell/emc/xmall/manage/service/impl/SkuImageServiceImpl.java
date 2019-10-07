package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.SkuImage;
import com.dell.emc.xmall.mapper.SkuImageMapper;
import com.dell.emc.xmall.service.SkuImageService;

/**
 * <p>
 * 库存单元图片表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class SkuImageServiceImpl extends ServiceImpl<SkuImageMapper, SkuImage> implements SkuImageService {

}
