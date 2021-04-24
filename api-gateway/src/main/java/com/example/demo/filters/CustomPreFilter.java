package com.example.demo.filters;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;

public class CustomPreFilter extends AbstractGatewayFilterFactory<CustomPreFilter.Config> {

	public static class Config{
		
	}

	@Override
	public GatewayFilter apply(Config config) {
		// TODO Auto-generated method stub
		return null;
	}
}
