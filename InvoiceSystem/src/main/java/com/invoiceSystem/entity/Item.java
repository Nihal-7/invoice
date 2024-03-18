package com.invoiceSystem.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
public  @Data class Item {
	
	@Id
	@Column(name="item_id")
	private int item_id;
	
	private String item_name;
	
	
}
