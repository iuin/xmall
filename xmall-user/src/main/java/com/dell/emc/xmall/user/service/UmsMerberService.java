package com.dell.emc.xmall.user.service;

import com.dell.emc.xmall.user.entity.UmsMember;
import com.dell.emc.xmall.user.entity.UmsMemberReceiveAddress;

import java.util.List;

public interface UmsMerberService {
    List<UmsMember> findAll();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId);
}
