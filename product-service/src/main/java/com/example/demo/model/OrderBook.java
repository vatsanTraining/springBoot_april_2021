package com.example.demo.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class OrderBook {

	
	@Autowired
	private List<Invoice> invoiceList;
	
}
