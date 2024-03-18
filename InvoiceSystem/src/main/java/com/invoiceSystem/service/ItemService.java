package com.invoiceSystem.service;

import java.util.List;
import java.util.Optional;

import com.invoiceSystem.entity.Item;

public interface ItemService {

	Item addItem(Item item);
	Optional<Item> getItem(int item_id);
	Iterable<Item> getAllItem();
	Item updateItem(Item item);
	String deleteItem(int item_id);
}
