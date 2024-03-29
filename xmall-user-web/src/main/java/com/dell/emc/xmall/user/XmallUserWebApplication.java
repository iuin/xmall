package com.dell.emc.xmall.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class XmallUserWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallUserWebApplication.class, args);
    }

}
