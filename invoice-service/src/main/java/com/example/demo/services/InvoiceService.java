package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import com.example.demo.entity.*;
import com.example.demo.repos.InvoiceRepository;

@Service
public class InvoiceService {

	
	private InvoiceRepository repo;

	public InvoiceService(InvoiceRepository repo) {
		super();
		this.repo = repo;
	}

	
	public List<Invoice> findAll(){
		
		
		return repo.findAll();
	}
	
	
	public Invoice findById(int id) {
		
		
		return repo.findById(id).get();
		
		//return repo.findById(id).orElseThrow(()-> new RuntimeException("Given Id not present"));
		
		}
	
	public Invoice addInvoice(Invoice entity) {
		
		return this.repo.save(entity);
	}
	
	
}
