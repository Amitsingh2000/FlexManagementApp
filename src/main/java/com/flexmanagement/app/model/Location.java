package com.flexmanagement.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="locationDetails")
public class Location 
{
	@Id
	private int locationId;
	private String locationName;
	private String hoardingSize;
	
	public int getLocationId() 
	{
		return locationId;
	}
	public void setLocationId(int locationId) 
	{
		this.locationId = locationId;
	}
	public String getLocationName() 
	{
		return locationName;
	}
	public void setLocationName(String locationName) 
	{
		this.locationName = locationName;
	}
	public String getHoardingSize() 
	{
		return hoardingSize;
	}
	public void setHoardingSize(String hoardingSize) 
	{
		this.hoardingSize = hoardingSize;
	}
	
	

}
