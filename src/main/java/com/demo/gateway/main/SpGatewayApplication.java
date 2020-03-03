package com.demo.gateway.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//springboot配置典型示例1：直接用配置扫描注解
//@ComponentScan(basePackages = { "com.demo.gateway" })
@SpringBootApplication
public class SpGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpGatewayApplication.class, args);
	}

}
