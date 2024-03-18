package com.invoiceSystem.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceSystem.dao.ItemDao;
import com.invoiceSystem.entity.Item;

@Service
@Transactional
public class ItemServiceImpl implements ItemService {

	@Autowired
	ItemDao dao;
	@Override
	public Item addItem(Item item) {
		// TODO Auto-generated method stub
		 return dao.save(item);
	}

	@Override
	public Optional<Item> getItem(int item_id) {
		// TODO Auto-generated method stub
		return dao.findById(item_id);
	}

	@Override
	public Iterable<Item> getAllItem() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Item updateItem(Item item) {
		
		return dao.save(item);
	}

	@Override
	public String deleteItem(int item_id) {
		// TODO Auto-generated method stub
		dao.deleteById(item_id);
		return "Deleted Succesfully";
	}

}
