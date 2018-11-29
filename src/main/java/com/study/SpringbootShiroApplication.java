package com.study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@SpringBootApplication
@EnableTransactionManagement
@MapperScan(basePackages = "com.study.mapper")
public class SpringbootShiroApplication {
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		System.out.println("#####开始启动项目####");

		SpringApplication.run(SpringbootShiroApplication.class, args);
		System.out.println("@@@@@@项目启动成功$$$$$$$$$$");
	}
}
