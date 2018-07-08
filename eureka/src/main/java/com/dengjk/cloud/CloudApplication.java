package com.dengjk.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * spring-cloud的服务发现与注册
 *
 * 步骤  在启动类加上EnableEurekaServer注解
 * 		在配置文件中配置euraka的属性
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudApplication {
	public static void main(String[] args) {
		SpringApplication.run(CloudApplication.class, args);
	}
}
