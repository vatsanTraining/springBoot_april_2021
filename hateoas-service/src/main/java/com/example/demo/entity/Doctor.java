package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.*;
@Data
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "apr_doctor")

public class Doctor {

	@Id
	int doctorId;
	String doctorName;
	
	
	@OneToMany(targetEntity =Patient.class,  cascade = CascadeType.ALL,
            fetch=FetchType.EAGER)
    @JoinColumn(name = "patient_ref" , referencedColumnName = "doctorId")
 
	
	Set<Patient> patientList;
	
}
