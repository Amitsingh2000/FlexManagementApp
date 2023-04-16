package com.flexmanagement.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flexmanagement.app.model.Location;

@Repository
public interface LocationRepository extends CrudRepository<Location, Integer>
{
	List<Location> findByLocationId(int locationId);
	default Location findSingleLocationByLocationId(int locationId) 
	{
        List<Location> location = findByLocationId(locationId);
        return location.isEmpty() ? null : location.get(0);
	}
	List<Location> findByLocationName(String locationName);
	List<Location> findByHoardingSize(String locationSize);
}
