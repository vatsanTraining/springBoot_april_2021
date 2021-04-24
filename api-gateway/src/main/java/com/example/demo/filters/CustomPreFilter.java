package com.example.demo.filters;

import java.net.URI;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.cloud.gateway.support.ServerWebExchangeUtils;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;

@Component
public class CustomPreFilter extends AbstractGatewayFilterFactory<CustomPreFilter.Config> {

	public static class Config{
		
	}

	public CustomPreFilter() {
		super(Config.class);
	}

	@Override
	public GatewayFilter apply(Config config) {

		
		
		 return (exchange, chain) -> {
	            ServerHttpRequest request = exchange.getRequest();

	 //  URI requestUri = exchange.get

	   
	            System.out.println("PRE FILTER =:"+request);
	         // System.out.println("PRE Filter =:"+ requestUrl);
	            
	            return chain.filter(exchange.mutate().build());
	        };
	}
	
}
