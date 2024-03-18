package com.invoiceSystem.entity;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Invoice {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rowno;
	
	
	
	private int quantity;
	
	@OneToOne
    @JoinColumn(name = "invoice_no")
    private Invoice_b invoice_b;
	
	
	@ManyToOne
    @JoinColumn(name = "c_id")
    private Characteristics characteristics;
	
	@OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
