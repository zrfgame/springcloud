package cn.com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer //打开注册中心
@SpringBootApplication //全局扫描springboot注解
public class eurekaMain {
	public static void main(String[] args) {
		SpringApplication.run(eurekaMain.class, args);
	}
}
