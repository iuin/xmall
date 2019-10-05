package com.dell.emc.xmall.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dell.emc.xmall.entity.Member;
import com.dell.emc.xmall.entity.MemberLevel;
import com.dell.emc.xmall.entity.MemberReceiveAddress;
import com.dell.emc.xmall.mapper.MemberLevelMapper;
import com.dell.emc.xmall.mapper.MemberMapper;
import com.dell.emc.xmall.mapper.MemberReceiveAddressMapper;
import com.dell.emc.xmall.user.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 会员表 服务实现类
 * </p>
 *
 * @author zhangf30
 * @since 2019-09-30
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

    @Autowired
    MemberReceiveAddressMapper memberReceiveAddressMapper;

    @Autowired
    MemberLevelMapper memberLevelMapper;

    @Override
    public List<MemberReceiveAddress> findMemberReceiveAddress(Long memberId) {
        return memberReceiveAddressMapper.selectList(
                new QueryWrapper<MemberReceiveAddress>()
                .eq("member_id", memberId));
    }

    @Override
    public MemberLevel findMemberLevel(Long memberLevelId) {
        return memberLevelMapper.selectOne(
                new QueryWrapper<MemberLevel>()
                        .eq("id",memberLevelId));
    }
}
