package com.hr.springboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//Dao接口可以@Repository 或 @Mapper
//Dao接口使用@Repository，入口程序需使用@MapperScan
//@MapperScan("com.hr.dao")
//Dao接口使用@Mapper，入口程序@MapperScan可以省略
@ServletComponentScan
public class Springboot2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2Application.class, args);
    }

}
