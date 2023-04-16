package com.flexmanagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flexmanagement.app.model.Location;
import com.flexmanagement.app.service.LocationServiceI;

@Controller
@RequestMapping(value="/Dashboard/")
public class LocationController {
	
	@Autowired
	LocationServiceI LocService;
	
	@RequestMapping(value="/locationHome")
	public String locationIndex()
	{
		return "locationHome";
	}
	@RequestMapping(value="/addLocationForm")
	public String addLocation()
	{
		return "InsertLocation";
	}
	@RequestMapping(value="addLocation")
	public String addLocation(@ModelAttribute Location location)
	{
		LocService.addLocation(location);
		return "redirect:/addLocationForm";
	}
	@RequestMapping(value="/viewLocationForm")
	public String viewLocation()
	{
		return "ViewLocation";
	}
	@RequestMapping(value="/viewLocation")
	public String viewLocation(@RequestParam("searchType") String searchType,@RequestParam("searchValue") String value,ModelMap m)
	{
		List<Location> location =null;
		if(searchType.equals("byId"))
		{
			int locationId =Integer.parseInt(value);
			location = LocService.viewLocationByLocationId(locationId);
		}
		else if(searchType.equals("byName"))
		{
			location = LocService.viewLocationByLocationName(value);
		}
		else if(searchType.equals("bySize"))
		{
			location = LocService.viewLocationByHoardingSize(value);
		}
		m.addAttribute("locationList",location);
		return "ViewLocation";
	}
	@RequestMapping(value="/viewAllLocations")
	public String viewLocation(ModelMap m)
	{
		List<Location> locationList =LocService.viewAllLocation();
		m.addAttribute("locationList",locationList);
		return "ViewLocation";
	}
	@RequestMapping(value="/deleteLocationForm")
	public String deleteLocation()
	{
		return "DeleteLocation";
	}
	@RequestMapping(value="/deleteLocation")
	public String deleteLocation(@RequestParam int locationId)
	{	LocService.deleteLocation(locationId);
		return "DeleteLocation";
	}
	@RequestMapping(value="/deleteAllLocations")
	public String deleteAllLocation()
	{
		LocService.deleteAllLocation();
		return "DeleteLocation";
	}
	@RequestMapping(value="/updateLocationForm")
	public String updateLocation()
	{
		return "UpdateLocation";
	}
	@RequestMapping(value="/retrieveLocation")
	public String updateLocation(@RequestParam int locationId,ModelMap m)
	{
		Location location = LocService.getLocation(locationId);
		m.addAttribute("location",location);
		return "UpdateLocation";
	}
	@RequestMapping(value="/updateLocation")
	public String updateLocation(@ModelAttribute Location loc)
	{
		LocService.addLocation(loc);
		return "redirect:/updateLocationForm";
	}
}
