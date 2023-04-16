package com.flexmanagement.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="CustomerDetails")
public class Customer 
{
	@Id
	private int reciptNo;
	private String customerName;
	private long mobileNo;
	@ManyToOne(cascade = CascadeType.ALL)
	private Location locationDetails;
	@ManyToOne(cascade = CascadeType.ALL)
	private Mounter mounterDetails;
	private double amountDetails;
	
	
	public int getReciptNo() {
		return reciptNo;
	}
	public void setReciptNo(int reciptNo) {
		this.reciptNo = reciptNo;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Location getLocationDetails() {
		return locationDetails;
	}
	public void setLocationDetails(Location locationDetails) {
		this.locationDetails = locationDetails;
	}
	public Mounter getMounterDetails() {
		return mounterDetails;
	}
	public void setMounterDetails(Mounter mounterDetails) {
		this.mounterDetails = mounterDetails;
	}
	public double getAmountDetails() {
		return amountDetails;
	}
	public void setAmountDetails(double amountDetails) {
		this.amountDetails = amountDetails;
	}
	
}
