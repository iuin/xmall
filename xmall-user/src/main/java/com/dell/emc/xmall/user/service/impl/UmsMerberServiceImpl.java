package com.dell.emc.xmall.user.service.impl;

import com.dell.emc.xmall.user.dao.UmsMemberDao;
import com.dell.emc.xmall.user.dao.UmsMemberReceiveAddressDao;
import com.dell.emc.xmall.user.entity.UmsMember;
import com.dell.emc.xmall.user.entity.UmsMemberReceiveAddress;
import com.dell.emc.xmall.user.service.UmsMerberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UmsMerberServiceImpl implements UmsMerberService {

    @Autowired
    UmsMemberDao umsMemberDao;

    @Autowired
    UmsMemberReceiveAddressDao umsMemberReceiveAddressDao;

    @Override
    public List<UmsMember> findAll() {
        return umsMemberDao.findAll();
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(Long memberId) {
        return null;
    }
}
