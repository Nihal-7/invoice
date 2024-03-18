package com.invoiceSystem.service;

import java.util.Optional;

import com.invoiceSystem.entity.Invoice;


public interface InvoiceService {

	Invoice addInvoice(Invoice Invoice);
	Optional<Invoice> getInvoice(int Invoice_id);
	Iterable<Invoice> getAllInvoice();
	Invoice updateInvoice(Invoice Invoice);
	String deleteInvoice(int Invoice_id);
}
