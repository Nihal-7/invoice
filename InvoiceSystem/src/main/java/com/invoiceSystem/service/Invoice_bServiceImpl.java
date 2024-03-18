package com.invoiceSystem.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceSystem.dao.Invoice_bDao;
import com.invoiceSystem.entity.Invoice_b;



@Service
@Transactional
public class Invoice_bServiceImpl implements Invoice_bService {

	@Autowired
	Invoice_bDao dao;
	@Override
	public Invoice_b addInvoice_b(Invoice_b Invoice_b) {
		// TODO Auto-generated method stub
		
		 return dao.save(Invoice_b);
	}

	@Override
	public Optional<Invoice_b> getInvoice_b(int Invoice_b_id) {
		// TODO Auto-generated method stub
		return dao.findById(Invoice_b_id);
	}

	@Override
	public Iterable<Invoice_b> getAllInvoice_b() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Invoice_b updateInvoice_b(Invoice_b Invoice_b) {
		
		return dao.save(Invoice_b);
	}

	@Override
	public String deleteInvoice_b(int Invoice_b_id) {
		// TODO Auto-generated method stub
		dao.deleteById(Invoice_b_id);
		return "Deleted Succesfully";
	}

}
