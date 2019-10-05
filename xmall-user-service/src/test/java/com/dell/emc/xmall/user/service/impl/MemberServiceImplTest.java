package com.dell.emc.xmall.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dell.emc.xmall.entity.Member;
import com.dell.emc.xmall.entity.MemberLevel;
import com.dell.emc.xmall.entity.MemberReceiveAddress;
import com.dell.emc.xmall.user.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;


@SpringBootTest
@RunWith(SpringRunner.class)
public class MemberServiceImplTest {

    @Autowired
    MemberService memberService;

    @Test
    public void listTest() {
        List<Member> list = memberService.list(new QueryWrapper<>());
        for (Member member : list) {
            System.out.println(member);
        }
    }

    @Test
    public void findMemberReceiveAddress() {
        List<MemberReceiveAddress> memberReceiveAddress = memberService.findMemberReceiveAddress(1l);
        for (MemberReceiveAddress receiveAddress : memberReceiveAddress) {
            System.out.println(receiveAddress);
        }
    }

    @Test
    public void findMemberLevel() {
        MemberLevel memberLevel = memberService.findMemberLevel(1l);
        System.out.println(memberLevel);
    }
}