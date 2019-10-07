package com.dell.emc.xmall.manage;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.dell.emc.xmall.mapper")
@EnableDubbo
public class XmallManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(XmallManageServiceApplication.class, args);
    }

}
