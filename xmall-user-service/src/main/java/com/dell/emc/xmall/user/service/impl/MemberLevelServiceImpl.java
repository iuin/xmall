package com.dell.emc.xmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.MemberLevel;
import com.dell.emc.xmall.mapper.MemberLevelMapper;
import com.dell.emc.xmall.service.MemberLevelService;

/**
 * <p>
 * 会员等级表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-09-30
 */
@Service
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements MemberLevelService {

}
