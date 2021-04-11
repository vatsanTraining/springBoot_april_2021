package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Invoice;
import java.util.*;

import javax.transaction.Transactional;
@Repository
public interface InvoiceRepository extends JpaRepository<Invoice, Integer> {

	
	public List<Invoice> findBycustomerName(String srchName);
	
	
	@Query(value = "update Invoice set amount = amount + amount*.10")
	@Modifying
	@Transactional
	public int updateAmount();
}
