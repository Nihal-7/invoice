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

import com.invoiceSystem.entity.Characteristics;
import com.invoiceSystem.service.CharacteristicsService;

@RestController

@RequestMapping("/Characteristics")
public class CharacteristicsController {

	@Autowired
	CharacteristicsService service;
	
	@PostMapping("/addCharacteristics")
	public Characteristics addCharacteristics(@RequestBody Characteristics Characteristics)
	{
		return service.addCharacteristics(Characteristics);
		 
	}
	
	@PutMapping("/updateCharacteristics") 
	public Characteristics updateCharacteristics(@RequestBody Characteristics Characteristics)
	{
		
		return service.updateCharacteristics(Characteristics);
		
	}
	
	@GetMapping("/getCharacteristics/{Characteristics_id}") 
	public Optional<Characteristics> getCharacteristics(@PathVariable("Characteristics_id") int Characteristics_id)
	{
		
		return service.getCharacteristics(Characteristics_id);
		
	}
	
	@GetMapping("/getAllCharacteristics") 
	public Iterable<Characteristics> getAllCharacteristics()
	{
		
		return service.getAllCharacteristics();
		
	}
	
	@DeleteMapping("/deleteCharacteristics/{Characteristics_id}")
	public void deleteMobile(@PathVariable("Characteristics_id") int Characteristics_id)
	{
		
		 service.deleteCharacteristics(Characteristics_id);
		
	}
}
