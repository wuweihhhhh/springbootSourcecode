package com.wuwei.sbdemo;

import com.wuwei.sbdemo.Controller.Hello;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;

@MapperScan(basePackages = "com.wuwei.sbdemo.mapper")
@SpringBootApplication()
public class SbdemoApplication {

	public static void main(String[] args) {

		//运行spring Boot 项目
		SpringApplication.run(SbdemoApplication.class, args);
	}

}
