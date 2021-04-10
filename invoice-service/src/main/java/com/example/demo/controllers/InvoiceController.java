package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import com.example.demo.entity.*;
import com.example.demo.services.InvoiceService;

@RestController
@RequestMapping(path = "/api/v1")
public class InvoiceController {

	
	private InvoiceService service;

	public InvoiceController(InvoiceService service) {
		super();
		this.service = service;
	}
	
	
	@GetMapping(path = "/invoices")
	public List<Invoice> findAll(){
		
		return this.service.findAll();
	}
}
