package com.dell.emc.xmall.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dell.emc.xmall.user.mapper")
public class XmallUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallUserApplication.class, args);
    }

}
