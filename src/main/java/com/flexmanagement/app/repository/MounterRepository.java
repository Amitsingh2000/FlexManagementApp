package com.flexmanagement.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flexmanagement.app.model.Mounter;

@Repository
public interface MounterRepository extends CrudRepository<Mounter, Integer>
{
	List<Mounter> findByMounterId(int mounterId);
	default Mounter findSingleMounterByMounterId(int mounterId) 
	{
        List<Mounter> mounter = findByMounterId(mounterId);
        return mounter.isEmpty() ? null : mounter.get(0);
	}
}
