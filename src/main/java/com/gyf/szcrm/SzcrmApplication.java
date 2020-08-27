package com.gyf.szcrm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages={"com.gyf.szcrm.mapper"})
public class SzcrmApplication {

    public static void main(String[] args) {
        SpringApplication.run(SzcrmApplication.class, args);
    }

}
