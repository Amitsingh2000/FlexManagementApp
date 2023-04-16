package com.flexmanagement.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.flexmanagement.app.model.Location;
import com.flexmanagement.app.repository.LocationRepository;

@Service
public class LocationServiceImpl implements LocationServiceI
{
	@Autowired
	LocationRepository LocRepo;
	@Override
	public void addLocation(Location location) 
	{
		LocRepo.save(location);
	}
	@Override
	public void deleteAllLocation() 
	{
		LocRepo.deleteAll();
	}
	@Override
	public void deleteLocation(int locationId) 
	{
		LocRepo.deleteById(locationId);
		
	}
	@Override
	public List<Location> viewAllLocation() 
	{
		List<Location> locationList = (List<Location>) LocRepo.findAll();
		return locationList;
	}
	@Override
	public List<Location> viewLocationByLocationId(int locationId) 
	{
		List<Location> locationList =LocRepo.findByLocationId(locationId);
		return locationList;
	}
	@Override
	public List<Location> viewLocationByLocationName(String locationName) 
	{
		List<Location> locationList =LocRepo.findByLocationName(locationName);
		return locationList;
	}
	@Override
	public List<Location> viewLocationByHoardingSize(String locationSize)
	{
		List<Location> locationList =LocRepo.findByHoardingSize(locationSize);
		return locationList;
	}
	@Override
	public void updateLocation(Location location) 
	{
		LocRepo.save(location);
		
	}
	@Override
	public Location getLocation(int locationId) 
	{
		Location location =LocRepo.findSingleLocationByLocationId(locationId);
		return location;
	}

}
