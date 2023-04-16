package com.flexmanagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flexmanagement.app.model.Customer;
import com.flexmanagement.app.model.Location;
import com.flexmanagement.app.model.Mounter;
import com.flexmanagement.app.repository.CustomerRepository;
import com.flexmanagement.app.repository.LocationRepository;
import com.flexmanagement.app.repository.MounterRepository;

@Service
public class CustomerServiceImpl implements CustomerServiceI
{
	@Autowired
	CustomerRepository CustRepo;
	@Autowired
	LocationRepository LocRepo;
	@Autowired
	MounterRepository MouRepo;
	@Override
	public void addCustomer(Customer customer) 
	{
		Location loc =LocRepo.findSingleLocationByLocationId(customer.getLocationDetails().getLocationId());
		Mounter mou =MouRepo.findSingleMounterByMounterId(customer.getMounterDetails().getMounterId());
		customer.setLocationDetails(loc);
		customer.setMounterDetails(mou);
		CustRepo.save(customer);
	}
	@Override
	public void deleteAllCustomer() {
		CustRepo.deleteAll();		
	}
	@Override
	public void deleteCustomer(int reciptNo) 
	{
		CustRepo.deleteById(reciptNo);	
	}
	
	@Override
	public List<Customer> viewCustomerByReciptNO(int reciptNo) {
		List<Customer> customer =CustRepo.findByReciptNo(reciptNo);
		return customer;
	}
	@Override
	public List<Customer> viewCustomerByCustomerName(String customerName) {
		List<Customer> customer =CustRepo.findByCustomerName(customerName);
		return customer;
	}
	@Override
	public List<Customer> viewCustomerByMobileNo(long mobileNo) {
		List<Customer> customer =CustRepo.findByMobileNo(mobileNo);
		return customer;
	}
	@Override
	public List<Customer> viewAllCustomer() 
	{
		List<Customer> customerList = (List<Customer>) CustRepo.findAll();
		return customerList;
		
	}

	@Override
	public void updateCustomer(Customer customer)
	{
		CustRepo.save(customer);
	}
	@Override
	public Customer getCustomer(int reciptNo) {
		Customer customer =CustRepo.findSingleCustomerByReceiptNo(reciptNo);
		return customer;
	}
	@Override
	public List<Location> getAllLocations() 
	{
		List<Location> locList=(List<Location>) LocRepo.findAll();
		return locList;
	}
	@Override
	public List<Mounter> getAllMounters() {
		List<Mounter> mouList =(List<Mounter>) MouRepo.findAll();
		return mouList;
	}
	
	

}
