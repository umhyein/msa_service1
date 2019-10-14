package com.example.msa_service1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
public class MsaService1Application {
	public static void main(String[] args) {
		SpringApplication.run(MsaService1Application.class, args);
	}
}

@RestController
@RefreshScope
class Service1{
	@Value("${service.name}")
	private String name;

	@GetMapping("/service1")
	public String test(){
		return name;
	}
}
