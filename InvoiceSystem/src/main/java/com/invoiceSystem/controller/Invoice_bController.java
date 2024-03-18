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

import com.invoiceSystem.entity.Invoice_b;
import com.invoiceSystem.service.Invoice_bService;


@RestController

@RequestMapping("/Invoice_b")
public class Invoice_bController {

	@Autowired
	Invoice_bService service;
	
	@PostMapping("/addInvoice_b")
	public Invoice_b addInvoice_b(@RequestBody Invoice_b it)
	{
		return service.addInvoice_b(it);
		 
	}
	
	@PutMapping("/updateInvoice_b") 
	public Invoice_b updateInvoice_b(@RequestBody Invoice_b it)
	{
		
		return service.updateInvoice_b(it);
		
	}
	
	@GetMapping("/getInvoice_b/{Invoice_b_id}") 
	public Optional<Invoice_b> getInvoice_b(@PathVariable("Invoice_b_id") int Invoice_b_id)
	{
		
		return service.getInvoice_b(Invoice_b_id);
		
	}
	
	@GetMapping("/getAllInvoice_b") 
	public Iterable<Invoice_b> getAllInvoice_b()
	{
		
		return service.getAllInvoice_b();
		
	}
	
	@DeleteMapping("/deleteInvoice_b/{Invoice_b_id}")
	public void deleteInvoice_b(@PathVariable("Invoice_b_id") int Invoice_b_id)
	{
		
		 service.deleteInvoice_b(Invoice_b_id);
		
	}
}
