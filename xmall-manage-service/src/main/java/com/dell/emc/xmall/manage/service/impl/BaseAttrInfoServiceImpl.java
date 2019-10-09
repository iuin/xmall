package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.BaseAttrInfo;
import com.dell.emc.xmall.mapper.BaseAttrInfoMapper;
import com.dell.emc.xmall.service.BaseAttrInfoService;

import java.util.List;

/**
 * <p>
 * 属性表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class BaseAttrInfoServiceImpl extends ServiceImpl<BaseAttrInfoMapper, BaseAttrInfo> implements BaseAttrInfoService {

    @Override
    public List<BaseAttrInfo> findAll(Long catalog3Id) {
        return list(new QueryWrapper<BaseAttrInfo>().eq("catalog3_id", catalog3Id));
    }
}
