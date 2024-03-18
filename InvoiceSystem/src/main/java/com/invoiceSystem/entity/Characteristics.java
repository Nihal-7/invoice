package com.invoiceSystem.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
public  @Data class Characteristics {

	@Id
	private int c_id;
	
	
	private String brand;
	private double price;
	private String color;
	
	@ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item;
}
