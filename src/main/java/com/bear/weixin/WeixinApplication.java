package com.bear.weixin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.bear.weixin.dao")
@EnableFeignClients
@EnableScheduling
public class WeixinApplication {

    public static void main(String[] args) {

        SpringApplication.run(WeixinApplication.class, args);

    }

}
