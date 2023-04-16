package com.flexmanagement.app.service;

import java.util.List;

import com.flexmanagement.app.model.Customer;
import com.flexmanagement.app.model.Location;
import com.flexmanagement.app.model.Mounter;

public interface CustomerServiceI
{
	
	public void addCustomer(Customer customer);
	public void deleteAllCustomer();
	public void deleteCustomer(int reciptNo);
	public List<Customer> viewAllCustomer();
	public List<Customer> viewCustomerByReciptNO(int reciptNo);
	public List<Customer> viewCustomerByCustomerName(String customerName);
	public List<Customer> viewCustomerByMobileNo(long mobileNo);
	public void updateCustomer(Customer customer);
	public Customer getCustomer(int reciptNo);
	public List<Location> getAllLocations();
	public List<Mounter> getAllMounters();
}
