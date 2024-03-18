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

import com.invoiceSystem.entity.Item;
import com.invoiceSystem.service.ItemService;


@RestController

@RequestMapping("/Items")
public class ItemController {

	@Autowired
	ItemService service;
	
	@PostMapping("/addItem")
	public Item addItem(@RequestBody Item it)
	{
		return service.addItem(it);
		 
	}
	
	@PutMapping("/updateItem") 
	public Item updateItem(@RequestBody Item it)
	{
		
		return service.updateItem(it);
		
	}
	
	@GetMapping("/getItem/{item_id}") 
	public Optional<Item> getItem(@PathVariable("item_id") int item_id)
	{
		
		return service.getItem(item_id);
		
	}
	
	@GetMapping("/getAllItem") 
	public Iterable<Item> getAllMobiles()
	{
		
		return service.getAllItem();
		
	}
	
	@DeleteMapping("/deleteItem/{item_id}")
	public void deleteMobile(@PathVariable("item_id") int item_id)
	{
		
		 service.deleteItem(item_id);
		
	}
}
