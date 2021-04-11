package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;
import java.util.*;
@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

	
	
	
}
