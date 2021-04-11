package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)

@Entity
@Table(name = "apr_patient")

public class Patient {

	@Id
	int patientId;
	String patientName;
	String caseHistory;
	
	
	    public Patient(int patientId, String patientName, String caseHistory) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.caseHistory = caseHistory;
	}


//		@ManyToOne
//	    @JoinColumn(name="doctor_ref" ,referencedColumnName = "doctorId")
//		@JsonIgnore
//		 
//	 	Doctor doctor;
}
