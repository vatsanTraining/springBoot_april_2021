package com.example.demo;

import java.time.LocalDate;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class InvoiceDTO {

	int id;
	String customerName;
	@DateTimeFormat(iso = ISO.DATE)
	LocalDate invoiceDate;
	double amount;
}
