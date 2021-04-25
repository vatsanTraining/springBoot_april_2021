package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ReviewServiceClientApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext ctx=SpringApplication.run(ReviewServiceClientApplication.class, args);
	
	       RestTemplate template = ctx.getBean(RestTemplate.class);
	       
	       
	       String response = template.getForObject("http://localhost:7070/reviews", String.class);
	       
	       System.out.println(response);
	
	}
	
	
	@Bean
	public RestTemplate template(BasicAuthenticationInterceptor interceptor) {
		
		RestTemplate template = new RestTemplate();
		  
		template.getInterceptors().add(interceptor);
		  
		return template;
		
	}


	@Bean
	public BasicAuthenticationInterceptor interceptor() {
		
		return new BasicAuthenticationInterceptor("india","india");
	}
}
