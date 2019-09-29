package com.dell.emc.xmall.user.dao;


import com.dell.emc.xmall.user.entity.UmsMember;
import com.dell.emc.xmall.user.entity.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMemberDao{
    List<UmsMember> findAll();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId);
}
