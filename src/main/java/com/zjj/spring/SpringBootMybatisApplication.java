package com.zjj.spring;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cache.annotation.EnableCaching;

//spring boot 配置类
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
//指定需要扫描的mapper文件  否则会导致DAO文件  无法注入到service中
@MapperScan("com.zjj.spring.dao")
public class SpringBootMybatisApplication{

    public static void main(String[] args) {

        SpringApplication.run(SpringBootMybatisApplication.class, args);

    }
}
