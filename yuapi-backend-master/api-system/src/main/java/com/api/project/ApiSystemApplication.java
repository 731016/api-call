package com.api.project;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tuaofei
 * @description 入口类
 * @date 2024/9/29
 */
@SpringBootApplication
@MapperScan("com.api.project.mapper")
@EnableDubbo
public class ApiSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ApiSystemApplication.class);
    }
}
