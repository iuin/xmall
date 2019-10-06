package com.dell.emc.xmall.user;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
@MapperScan("com.dell.emc.xmall.mapper")
public class XmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallUserServiceApplication.class, args);
    }

}
