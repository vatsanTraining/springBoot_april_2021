package org.example.demo.custom;

import java.util.ArrayList;
import java.util.List;

import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class CustomRouteRepository implements RouteDefinitionRepository {

	@Override
	public Flux<RouteDefinition> getRouteDefinitions() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mono<Void> save(Mono<RouteDefinition> route) {

		List<RouteDefinition> routeDefinitions = new ArrayList<>();

		RouteDefinition routeDefinition = new RouteDefinition();
   routeDefinition.setId("");
   routeDefinition.setFilters(null);
   routeDefinition.setPredicates(null);
   routeDefinition.setUri(null);
   routeDefinition.setOrder(0);
   
		return null;
	}

	@Override
	public Mono<Void> delete(Mono<String> routeId) {
		// TODO Auto-generated method stub
		return null;
	}

}
