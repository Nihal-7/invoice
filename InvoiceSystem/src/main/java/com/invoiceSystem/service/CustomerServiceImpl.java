package com.invoiceSystem.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceSystem.dao.CustomerDao;
import com.invoiceSystem.entity.Customer;


@Service
@Transactional

public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDao dao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
		return dao.save(customer);
	}

	@Override
	public Optional<Customer> getCustomer(int customer_id) {
		// TODO Auto-generated method stub
		return dao.findById(customer_id);
	}

	@Override
	public Iterable<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return dao.save(customer);
	}

	@Override
	public String deleteCustomer(int customer_id) {
		// TODO Auto-generated method stub
		dao.deleteById(customer_id);
		return "Deleted Succesfully";
	}

	
	
}
