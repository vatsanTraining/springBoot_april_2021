package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.*;
import java.util.*;

import javax.transaction.Transactional;
@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

	
	
	
}
