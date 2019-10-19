package com.dell.emc.xmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.BaseAttrInfo;
import com.dell.emc.xmall.entity.BaseAttrValue;
import com.dell.emc.xmall.mapper.BaseAttrInfoMapper;
import com.dell.emc.xmall.service.BaseAttrInfoService;
import com.dell.emc.xmall.service.BaseAttrValueService;
import com.dell.emc.xmall.vo.AttrInfoVO;
import com.dell.emc.xmall.vo.AttrValueVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 * 属性表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-10-07
 */
@Service
@Transactional
public class BaseAttrInfoServiceImpl extends ServiceImpl<BaseAttrInfoMapper, BaseAttrInfo> implements BaseAttrInfoService {

    @Autowired
    BaseAttrValueService attrValueService;

    @Override
    public List<BaseAttrInfo> findAll(Long catalog3Id) {
        return list(new QueryWrapper<BaseAttrInfo>().eq("catalog3_id", catalog3Id));
    }

    @Override
    public boolean saveAttrInfo(AttrInfoVO attrInfoVO) {
        BaseAttrInfo baseAttrInfo = new BaseAttrInfo();
        baseAttrInfo.setId(attrInfoVO.getId());
        baseAttrInfo.setAttrName(attrInfoVO.getAttrName());
        baseAttrInfo.setCatalog3Id(attrInfoVO.getCatalog3Id());
        List<AttrValueVO> attrValueList = attrInfoVO.getAttrValueList();
        saveOrUpdate(baseAttrInfo);
        List<BaseAttrValue> attrValues = attrValueList.stream().map(e -> {
                BaseAttrValue value = new BaseAttrValue();
                value.setId(null);
                value.setAttrId(baseAttrInfo.getId());
                value.setValueName(e.getValueName());
                value.setIsEnabled("");
                return value;
            }
        ).collect(Collectors.toList());
        attrValueService.remove(new QueryWrapper<BaseAttrValue>().eq("attr_id", baseAttrInfo.getId()));
        if(attrValues.isEmpty()) {
            return true;
        }
        return attrValueService.saveOrUpdateBatch(attrValues);
    }
}
