package com.james;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // EurekaServer服务器端启动类,接受其它微服务注册进来
public class SpringCloudDemo7003Eureka06App {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemo7003Eureka06App.class, args);
	}
}
