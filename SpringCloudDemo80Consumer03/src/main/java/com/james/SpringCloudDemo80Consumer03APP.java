package com.james;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudDemo80Consumer03APP {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudDemo80Consumer03APP.class, args);
	}
}
