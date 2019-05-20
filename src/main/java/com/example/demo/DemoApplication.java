package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//System.out.println("HI");
		SpringApplication.run(DemoApplication.class, args);
	}
	
	 @Bean
	  public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	   }

}
