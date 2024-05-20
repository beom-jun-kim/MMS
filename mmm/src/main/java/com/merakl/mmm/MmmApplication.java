package com.merakl.mmm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
@MapperScan(basePackages = "com.merakl.mmm.mapper")
public class MmmApplication {
	public static void main(String[] args) {
		SpringApplication.run(MmmApplication.class, args);
	}
}
