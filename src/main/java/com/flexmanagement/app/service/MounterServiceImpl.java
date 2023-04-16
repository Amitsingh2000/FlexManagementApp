package com.flexmanagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flexmanagement.app.model.Mounter;
import com.flexmanagement.app.repository.MounterRepository;

@Service
public class MounterServiceImpl implements MounterServiceI
{
	
	@Autowired
	MounterRepository MounterRepo;
	@Override
	public void addMounter(Mounter mounter)
	{
		MounterRepo.save(mounter);
	}

	@Override
	public void deleteMounter(int mounterId)
	{
		MounterRepo.deleteById(mounterId);
	}

	@Override
	public void deleteAllMounter()
	{
		MounterRepo.deleteAll();
	}

	@Override
	public List<Mounter> viewAllMounters()
	{
		List<Mounter> mounterList =(List<Mounter>) MounterRepo.findAll();
		return mounterList;
	}

	@Override
	public List<Mounter> viewMounterById(int mounterId) 
	{
		List<Mounter> mounterList =MounterRepo.findByMounterId(mounterId);
		return mounterList;
	}

	@Override
	public void updateMounter(Mounter mounter) 
	{
		MounterRepo.save(mounter);
	}

	@Override
	public Mounter getMounter(int mounterId) 
	{
		Mounter mounter =MounterRepo.findSingleMounterByMounterId(mounterId);
		return mounter;
	}

	
}
