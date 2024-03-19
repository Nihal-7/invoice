package com.product.products;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
class InvoiceServiceImplTest {

	@InjectMocks
	private InvoiceServiceImpl invoiceServiceImpl;

	@Mock
	private InvoiceDao dao;


	@Test
	void testAddInvoice() {
		Invoice invoice = new Invoice();
		invoice.setQuantity(1);
		when(dao.save(any(Invoice.class))).thenReturn(invoice);
		assertEquals(invoice, invoiceServiceImpl.addInvoice(invoice));
	}
}
