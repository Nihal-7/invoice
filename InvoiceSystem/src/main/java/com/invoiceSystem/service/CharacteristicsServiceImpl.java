package com.invoiceSystem.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceSystem.dao.CharacteristicsDao;
import com.invoiceSystem.entity.Characteristics;



@Service
@Transactional
public class CharacteristicsServiceImpl implements CharacteristicsService {

	@Autowired
	CharacteristicsDao dao;
	@Override
	public Characteristics addCharacteristics(Characteristics Characteristics) {
		// TODO Auto-generated method stub
		 return dao.save(Characteristics);
	}

	@Override
	public Optional<Characteristics> getCharacteristics(int Characteristics_id) {
		// TODO Auto-generated method stub
		return dao.findById(Characteristics_id);
	}

	@Override
	public Iterable<Characteristics> getAllCharacteristics() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Characteristics updateCharacteristics(Characteristics Characteristics) {
		
		return dao.save(Characteristics);
	}

	@Override
	public String deleteCharacteristics(int Characteristics_id) {
		// TODO Auto-generated method stub
		dao.deleteById(Characteristics_id);
		return "Deleted Succesfully";
	}

}
