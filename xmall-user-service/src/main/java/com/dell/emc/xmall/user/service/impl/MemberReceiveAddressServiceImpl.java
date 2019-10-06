package com.dell.emc.xmall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.MemberReceiveAddress;
import com.dell.emc.xmall.mapper.MemberReceiveAddressMapper;
import com.dell.emc.xmall.service.MemberReceiveAddressService;

/**
 * <p>
 * 会员收货地址表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-09-30
 */
@Service
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressMapper, MemberReceiveAddress> implements MemberReceiveAddressService {

}
