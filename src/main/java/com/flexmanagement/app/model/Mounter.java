package com.flexmanagement.app.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mounterDetails")
public class Mounter 
{
	@Id
	private int mounterId;
	private String mounterName;
	
	public int getMounterId() 
	{
		return mounterId;
	}
	public void setMounterId(int mountId) 
	{
		this.mounterId = mountId;
	}
	public String getMounterName() 
	{
		return mounterName;
	}
	public void setMounterName(String mounterName) 
	{
		this.mounterName = mounterName;
	}
	
	

}
