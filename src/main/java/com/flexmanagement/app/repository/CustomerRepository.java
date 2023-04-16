package com.flexmanagement.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flexmanagement.app.model.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>
{

	List<Customer> findByReciptNo(int reciptNo);
	default Customer findSingleCustomerByReceiptNo(int receiptNo) 
	{
        List<Customer> customers = findByReciptNo(receiptNo);
        return customers.isEmpty() ? null : customers.get(0);
	}
	List<Customer> findByCustomerName(String customerName);
	List<Customer> findByMobileNo(long mobileNo);
	
}
