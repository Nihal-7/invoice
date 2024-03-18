package com.invoiceSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoiceSystem.entity.Invoice_b;

@Repository
public interface Invoice_bDao extends JpaRepository<Invoice_b, Integer> {

}
