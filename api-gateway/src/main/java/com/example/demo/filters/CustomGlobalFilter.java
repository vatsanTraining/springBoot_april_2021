package com.example.demo.filters;

import java.util.Set;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

@Component
public class CustomGlobalFilter implements GlobalFilter,Ordered {

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {

		
		
                             
        boolean result =exchange.getRequest().getURI().getRawPath().contains("reviews");
        
        System.out.println("RESULT =========="+ result);
        
//        if(result) {
//        	exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
//        	return exchange.getResponse().setComplete();
//        }
//      
		return chain.filter(exchange);
}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 4;
	}
}