package com.invoiceSystem.service;

import java.util.Optional;

import com.invoiceSystem.entity.Invoice_b;



public interface Invoice_bService {

	Invoice_b addInvoice_b(Invoice_b invoice_b);
	Optional<Invoice_b> getInvoice_b(int invoice_b_id);
	Iterable<Invoice_b> getAllInvoice_b();
	Invoice_b updateInvoice_b(Invoice_b invoice_b);
	String deleteInvoice_b(int invoice_b_id);
}
