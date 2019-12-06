package com.qiaoyanan.springbootplus;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.qiaoyanan.springbootplus.dao")
@SpringBootApplication
@EnableSwagger2  //开启swagger注解
public class SpringbootplusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootplusApplication.class, args);
	}

}
