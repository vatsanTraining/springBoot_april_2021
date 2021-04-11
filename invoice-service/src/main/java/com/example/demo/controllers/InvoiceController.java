package com.example.demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	
	@GetMapping(path = "/invoices/{id}")
	public Invoice findById(@PathVariable("id") int id){
		
		return this.service.findById(id);
	}
	

//	@PostMapping(path = "/invoices")
//	public Invoice save(@RequestBody Invoice entity){
//		
//		return this.service.addInvoice(entity);
//	}

	@PostMapping(path = "/invoices")

	public ResponseEntity<Invoice> save(@RequestBody Invoice entity) {
			
		  Invoice addedEntity = this.service.addInvoice(entity);
		  
		return ResponseEntity.status(HttpStatus.CREATED).body(addedEntity);
	}

	
	@PutMapping(path = "/invoices")
	public Invoice update(@RequestBody Invoice entity){
		
		return this.service.updateInvoice(entity);
	}
	
	
	@DeleteMapping(path = "/invoices")
	public ResponseEntity<Invoice> remove(@RequestBody Invoice entity){
		
		
		Invoice invoice = this.service.removeInvoice(entity).orElseThrow(()-> new RuntimeException("Element NOT FOUND"));


	     return ResponseEntity.ok().body(invoice);


	}
	
	
}
