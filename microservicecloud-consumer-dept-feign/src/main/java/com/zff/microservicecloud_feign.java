package com.zff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

 
@SpringBootApplication
@EnableEurekaClient
 
@EnableFeignClients(basePackages= {"com.zff"})
@ComponentScan("com.zff")
public class microservicecloud_feign {

	public static void main(String[] args) {
		SpringApplication.run(microservicecloud_feign.class,args);
	}

}
