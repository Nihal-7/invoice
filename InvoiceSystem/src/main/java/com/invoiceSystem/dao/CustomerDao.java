package com.invoiceSystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.invoiceSystem.entity.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer,Integer>{

}
