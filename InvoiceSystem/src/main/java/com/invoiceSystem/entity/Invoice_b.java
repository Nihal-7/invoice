package com.invoiceSystem.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Invoice_b {

	@Id
	private int invoice_no;
	private String date;
	private double total_amount;
	
	
	
	
}
