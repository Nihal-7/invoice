package com.invoiceSystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.invoiceSystem.entity.Customer;
import com.invoiceSystem.service.CustomerService;



@RestController

@RequestMapping("/Customers")
public class CutomerController {

	@Autowired
	CustomerService service;
	
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer)
	{
		return service.addCustomer(customer);
		 
	}
	
	@PutMapping("/updateCustomer") 
	public Customer updateCustomer(@RequestBody Customer customer)
	{
		
		return service.updateCustomer(customer);
		
	}
	
	@GetMapping("/getCustomer/{Customer_id}") 
	public Optional<Customer> getCustomer(@PathVariable("Customer_id") int Customer_id)
	{
		
		return service.getCustomer(Customer_id);
		
	}
	
	@GetMapping("/getAllCustomer") 
	public Iterable<Customer> getAllCustomer()
	{
		
		return service.getAllCustomer();
		
	}
	
	@DeleteMapping("/deleteCustomer/{Customer_id}")
	public void deleteMobile(@PathVariable("Customer_id") int Customer_id)
	{
		
		 service.deleteCustomer(Customer_id);
		
	}
}
