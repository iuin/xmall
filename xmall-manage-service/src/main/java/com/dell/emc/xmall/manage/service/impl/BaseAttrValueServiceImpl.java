package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.BaseAttrValue;
import com.dell.emc.xmall.mapper.BaseAttrValueMapper;
import com.dell.emc.xmall.service.BaseAttrValueService;

import java.util.List;

/**
 * <p>
 * 属性值表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
public class BaseAttrValueServiceImpl extends ServiceImpl<BaseAttrValueMapper, BaseAttrValue> implements BaseAttrValueService {

    @Override
    public List<BaseAttrValue> findAll(Long attrId) {
        return list(new QueryWrapper<BaseAttrValue>().eq("attr_id", attrId));
    }
}
