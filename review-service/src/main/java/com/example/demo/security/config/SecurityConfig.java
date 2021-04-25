package com.example.demo.security.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {

		 auth.inMemoryAuthentication()
		    .withUser("india")
		      .password("{noop}india")
		        .and()
		         .withUser("GUEST");
		 
	
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {

		http.authorizeRequests()
		       .antMatchers("/reviews")
		           .authenticated()
		                .and()
		                  .httpBasic();
	}

}
