package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReviewServiceClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(ReviewServiceClientApplication.class, args);
	
	       RestTemplate template = ctx.getBean(RestTemplate.class);
	       
	       
	       String response = template.getForObject("http://REVIEW-SERVICE/reviews", String.class);
	       
	
	}
	
	
	@LoadBalanced
	@Bean
	public RestTemplate template() {
		
		
		return new RestTemplate();
	}

}
