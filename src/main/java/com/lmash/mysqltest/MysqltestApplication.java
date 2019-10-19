package com.lmash.mysqltest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@MapperScan(basePackages = "com.lmash.mysqltest.mapper")
public class MysqltestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqltestApplication.class, args);
    }

}
