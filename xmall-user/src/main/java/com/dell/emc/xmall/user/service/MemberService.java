package com.dell.emc.xmall.user.service;

import com.dell.emc.xmall.user.entity.Member;
import com.baomidou.mybatisplus.extension.service.IService;
import com.dell.emc.xmall.user.entity.MemberReceiveAddress;

import java.util.List;

/**
 * <p>
 * 会员表 服务类
 * </p>
 *
 * @author zhangf30
 * @since 2019-09-30
 */
public interface MemberService extends IService<Member> {
    List<MemberReceiveAddress> findMemberReceiveAddress(Long memberId);
}
