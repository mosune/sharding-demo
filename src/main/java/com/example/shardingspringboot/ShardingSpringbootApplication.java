package com.example.shardingspringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.shardingspringboot.repo")
@SpringBootApplication
public class ShardingSpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSpringbootApplication.class, args);
    }

}
