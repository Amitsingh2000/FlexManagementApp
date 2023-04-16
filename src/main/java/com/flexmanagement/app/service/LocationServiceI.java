package com.flexmanagement.app.service;

import java.util.List;

import com.flexmanagement.app.model.Location;

public interface LocationServiceI
{
	public void addLocation(Location location);
	public void deleteAllLocation();
	public void deleteLocation(int locationId);
	public List<Location> viewAllLocation();
	public List<Location> viewLocationByLocationId(int locationId);
	public List<Location> viewLocationByLocationName(String locationName);
	public List<Location> viewLocationByHoardingSize(String locationSize);
	public void updateLocation(Location location);
	public Location getLocation(int reciptNo);

}
