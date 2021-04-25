package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Order;

@RestController
public class PlaceOrderController {

	
	@Autowired
	@Qualifier("output")
	private MessageChannel channel;
	
	@PostMapping(path = "/api/v1/orders")
	public Order addOrders(@RequestBody Order entity) {
		
		channel.send(MessageBuilder.withPayload(entity).build());
		
		return entity;
		
	}
}
