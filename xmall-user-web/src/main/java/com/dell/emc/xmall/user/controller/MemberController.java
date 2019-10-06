package com.dell.emc.xmall.user.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.dell.emc.xmall.entity.Member;
import com.dell.emc.xmall.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 会员表 前端控制器
 * </p>
 *
 * @author zhangf30
 * @since 2019-09-30
 */
@RestController
@RequestMapping("/member")
public class MemberController {

    @Reference(version = "${user.service.version}")
    MemberService memberService;

    @GetMapping
    public List<Member> getMembers() {
        return memberService.pageList();
    }
}

