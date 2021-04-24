package com.example.demo.filters;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;


import reactor.core.publisher.Mono;

@Component
public class CustomPostFilter extends AbstractGatewayFilterFactory<CustomPostFilter.Config> {

public static class Config{
		
	}


public CustomPostFilter() {
	super(Config.class);

}


@Override
public GatewayFilter apply(Config config) {

	
	
	return (exchange,chain) ->{
		
		return chain.filter(exchange).then(Mono.fromRunnable(()->{
			
			 ServerHttpResponse resp = exchange.getResponse();
			 
			  System.out.println("Response Status Code:=" +resp.getStatusCode());
			  
			System.out.println("Inside Post Filter");
		}));
	};
}

}
