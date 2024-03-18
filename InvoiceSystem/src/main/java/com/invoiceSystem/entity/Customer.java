package com.invoiceSystem.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public @Data class Customer {

	@Id
	@Column(name="customer_id")
	private int customer_id;
	private String customer_name;
	private String customer_addr;
	private String customer_mobno;
	
	
}
