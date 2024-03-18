package com.invoiceSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.invoiceSystem.entity.Invoice;

@Repository
public interface InvoiceDao  extends CrudRepository<Invoice, Integer>{

}
