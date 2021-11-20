package com.jackey.wikistudy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jackey.wikistudy.mapper")
public class WikistudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WikistudyApplication.class, args);
    }

}
