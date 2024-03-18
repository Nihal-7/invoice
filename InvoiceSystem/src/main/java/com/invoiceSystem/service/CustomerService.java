package com.invoiceSystem.service;

import java.util.Optional;

import com.invoiceSystem.entity.Customer;

public interface CustomerService {

	Customer addCustomer(Customer Customer);
	Optional<Customer> getCustomer(int Customer_id);
	Iterable<Customer> getAllCustomer();
	Customer updateCustomer(Customer Customer);
	String deleteCustomer(int Customer_id);
}
