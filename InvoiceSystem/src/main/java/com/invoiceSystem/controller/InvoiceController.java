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

import com.invoiceSystem.entity.Invoice;
import com.invoiceSystem.service.InvoiceService;


@RestController

@RequestMapping("/Invoices")
public class InvoiceController {

	@Autowired
	InvoiceService service;
	
	@PostMapping("/addInvoice")
	public Invoice addInvoice(@RequestBody Invoice it)
	{
		return service.addInvoice(it);
		 
	}
	
	@PutMapping("/updateInvoice") 
	public Invoice updateInvoice(@RequestBody Invoice it)
	{
		
		return service.updateInvoice(it);
		
	}
	
	@GetMapping("/getInvoice/{Invoice_id}") 
	public Optional<Invoice> getInvoice(@PathVariable("Invoice_id") int Invoice_id)
	{
		
		return service.getInvoice(Invoice_id);
		
	}
	
	@GetMapping("/getAllInvoice") 
	public Iterable<Invoice> getAllMobiles()
	{
		
		return service.getAllInvoice();
		
	}
	
	@DeleteMapping("/deleteInvoice/{Invoice_id}")
	public void deleteMobileInvoice(@PathVariable("Invoice_id") int Invoice_id)
	{
		
		 service.deleteInvoice(Invoice_id);
		
	}
}
