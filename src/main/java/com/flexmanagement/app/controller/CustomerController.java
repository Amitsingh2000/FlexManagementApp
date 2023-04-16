package com.flexmanagement.app.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flexmanagement.app.model.Customer;
import com.flexmanagement.app.model.Location;
import com.flexmanagement.app.model.Mounter;
import com.flexmanagement.app.service.CustomerServiceI;

@Controller
@RequestMapping(value="/Dashboard/")
public class CustomerController 
{
	@Autowired
	CustomerServiceI CustService;
	@RequestMapping(value="/customerHome")
	public String customerIndex()
	{
		return"customerHome";
	}
	@RequestMapping(value="/addCustomerForm")
	public String addCustomer(ModelMap m)
	{
		List<Location> locList =CustService.getAllLocations();
		List<Mounter> mouList=CustService.getAllMounters();
		m.addAttribute("mounterList",mouList);
		m.addAttribute("locationList",locList);
		return "InsertCustomer";
	}
	@RequestMapping(value="/addCustomer")
	public String addCustomer(@ModelAttribute Customer customer)
	{
		CustService.addCustomer(customer);
		return "redirect:/addCustomerForm";
	}
	@RequestMapping(value="/viewCustomerForm")
	public String viewCustomer()
	{
		return "ViewCustomer";
	}
	@RequestMapping(value="/viewCustomer")
	public String viewCustomer(@RequestParam("searchType") String searchType,@RequestParam("searchValue") String value,ModelMap m)
	{
		List<Customer> customer =null;
		if(searchType.equals("byId"))
		{
			int reciptNo =Integer.parseInt(value);
			customer = CustService.viewCustomerByReciptNO(reciptNo);
		}
		else if(searchType.equals("byName"))
		{
			customer = CustService.viewCustomerByCustomerName(value);
		}
		else if(searchType.equals("byMobileNo"))
		{
			long MobileNo =Long.parseLong(value);
			customer = CustService.viewCustomerByMobileNo(MobileNo);
		}
		m.addAttribute("customerList",customer);
		return "ViewCustomer";
	}
	@RequestMapping(value="/viewAllCustomers")
	public String viewCustomer(ModelMap m)
	{
		List<Customer> customerList =CustService.viewAllCustomer();
		m.addAttribute("customerList",customerList);
		return "ViewCustomer";
	}
	@RequestMapping(value="/deleteCustomerForm")
	public String deleteCustomer()
	{
		return "DeleteCustomer";
	}
	@RequestMapping(value="/deleteCustomer")
	public String deleteCustomer(@RequestParam int reciptNo)
	{	CustService.deleteCustomer(reciptNo);
		return "DeleteCustomer";
	}
	@RequestMapping(value="/deleteAllCustomers")
	public String deleteAllCustomer()
	{
		CustService.deleteAllCustomer();
		return "DeleteCustomer";
	}
	@RequestMapping(value="/updateCustomerForm")
	public String updateCustomer()
	{
		return "UpdateCustomer";
	}
	@RequestMapping(value="/retrieveCustomer")
	public String updateCustomer(@RequestParam int reciptNo,ModelMap m)
	{
		Customer customer = CustService.getCustomer(reciptNo);
		m.addAttribute("customer",customer);
		List<Location> locList =CustService.getAllLocations();
		List<Mounter> mouList=CustService.getAllMounters();
		locList.remove(customer.getLocationDetails());
		mouList.remove(customer.getMounterDetails());
		m.addAttribute("mounterList",mouList);
		m.addAttribute("locationList",locList);
		return "UpdateCustomer";
	}
	@RequestMapping(value="/updateCustomer")
	public String updateCustomer(@ModelAttribute Customer c)
	{
		CustService.addCustomer(c);
		return "redirect:/updateCustomerForm";
	}
	

}
