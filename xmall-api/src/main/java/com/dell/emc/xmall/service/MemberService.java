package com.dell.emc.xmall.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dell.emc.xmall.entity.Member;
import com.dell.emc.xmall.entity.MemberLevel;
import com.dell.emc.xmall.entity.MemberReceiveAddress;

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

    List<Member> pageList();

    List<MemberReceiveAddress> findMemberReceiveAddress(Long memberId);

    MemberLevel findMemberLevel(Long memberLevelId);
}
