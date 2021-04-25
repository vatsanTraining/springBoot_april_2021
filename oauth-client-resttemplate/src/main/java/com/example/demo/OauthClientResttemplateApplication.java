package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.security.oauth2.client.token.grant.client.ClientCredentialsResourceDetails;
import org.springframework.security.oauth2.client.token.grant.password.ResourceOwnerPasswordResourceDetails;

@SpringBootApplication
public class OauthClientResttemplateApplication {

	public static void main(String[] args) {
	 ConfigurableApplicationContext ctx	=SpringApplication.run(OauthClientResttemplateApplication.class, args);
	
	      OAuth2RestTemplate template = ctx.getBean(OAuth2RestTemplate.class);
	      
	      String response =template.getForObject("http://localhost:8585/api/v1/customers", String.class);
	      
	        System.out.println(response);
	
	}

	@Bean
	public OAuth2RestTemplate template() {
		
		ResourceOwnerPasswordResourceDetails details = new ResourceOwnerPasswordResourceDetails();

		//ClientCredentialsResourceDetails details = new ClientCredentialsResourceDetails();
		
	     details.setAccessTokenUri("http://localhost:8585/oauth/token");

	     details.setClientId("ourclient");
	     details.setClientSecret("pass123");
	     details.setUsername("india");
	     details.setPassword("india");
	     details.setGrantType("password");
	      
	            OAuth2RestTemplate template = new OAuth2RestTemplate(details);
	                return template;
	}
}
