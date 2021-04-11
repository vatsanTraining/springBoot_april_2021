package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.example.demo.entity.Invoice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ErrorDetails {

	LocalDateTime time;
	String message;
	String description;
	
	
}
