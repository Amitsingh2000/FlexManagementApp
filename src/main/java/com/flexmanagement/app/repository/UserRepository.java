package com.flexmanagement.app.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flexmanagement.app.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, String>
{
	User findByUsername(String username);
}
