package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@Component(value = "inv1")
public class Invoice {

	Customer customer;
	Product product;
	
	@Autowired
	public Invoice(Customer customer,@Qualifier("tv") Product product) {
		super();
		this.customer = customer;
		this.product = product;
	}

	
	
}
