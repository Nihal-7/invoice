package com.invoiceSystem.service;

import java.util.Optional;

import com.invoiceSystem.entity.Characteristics;



public interface CharacteristicsService {

	Characteristics addCharacteristics(Characteristics Characteristics);
	Optional<Characteristics> getCharacteristics(int Characteristics_id);
	Iterable<Characteristics> getAllCharacteristics();
	Characteristics updateCharacteristics(Characteristics Characteristics);
	String deleteCharacteristics(int Characteristics_id);
}
