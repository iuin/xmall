package com.dell.emc.xmall.user.config;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZookeeperConfig {

    @Value("${dubbo.registry.address}")
    private String zkUrl;

    @Bean
    public CuratorFramework getCuratorFramework(){
        CuratorFramework client = CuratorFrameworkFactory.builder().connectString(zkUrl)
                .sessionTimeoutMs(10000)    // 连接超时时间
                .connectionTimeoutMs(10000) // 会话超时时间
                // 刚开始重试间隔为1秒，之后重试间隔逐渐增加，最多重试不超过三次
                .retryPolicy(new ExponentialBackoffRetry(10000, 3))
                .build();
        client.start();
        return client;
    }
}
