package com.chengge.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.chengge.admin.dao")
public class ChengGeApplication extends SpringBootServletInitializer {


	public static void main(String[] args) {
		SpringApplication.run(ChengGeApplication.class, args);
	}
}
