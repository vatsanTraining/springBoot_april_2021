package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.demo.entity.Customer;

@RepositoryRestResource
public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Customer findByPhoneNumber(long phoneNumber);
	
	//@RestResource(exported = false)
	public Customer save(Customer cust);
}
