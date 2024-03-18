package com.invoiceSystem.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invoiceSystem.dao.InvoiceDao;
import com.invoiceSystem.entity.Invoice;



@Service
@Transactional
public class InvoiceServiceImpl implements InvoiceService {

	@Autowired
	InvoiceDao dao;
	@Override
	public Invoice addInvoice(Invoice Invoice) {
		// TODO Auto-generated method stub
		 return dao.save(Invoice);
	}

	@Override
	public Optional<Invoice> getInvoice(int Invoice_id) {
		// TODO Auto-generated method stub
		return dao.findById(Invoice_id);
	}

	@Override
	public Iterable<Invoice> getAllInvoice() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public Invoice updateInvoice(Invoice Invoice) {
		
		return dao.save(Invoice);
	}

	@Override
	public String deleteInvoice(int Invoice_id) {
		// TODO Auto-generated method stub
		dao.deleteById(Invoice_id);
		return "Deleted Succesfully";
	}

}
