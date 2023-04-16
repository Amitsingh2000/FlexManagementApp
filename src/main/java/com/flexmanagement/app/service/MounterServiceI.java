package com.flexmanagement.app.service;

import java.util.List;

import com.flexmanagement.app.model.Mounter;

public interface MounterServiceI 
{
	public void addMounter(Mounter mounter);
	public void deleteMounter(int mounterId);
	public void deleteAllMounter();
	public List<Mounter> viewAllMounters();
	public List<Mounter> viewMounterById(int mounterId);
	public void updateMounter(Mounter mounter);
	public Mounter getMounter(int mounterId);

}
