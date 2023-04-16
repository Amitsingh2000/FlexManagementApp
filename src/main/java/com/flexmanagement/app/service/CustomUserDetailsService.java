package com.flexmanagement.app.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.flexmanagement.app.config.PasswordEncoderUtil;
import com.flexmanagement.app.model.User;
import com.flexmanagement.app.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService,UserServiceI
{
	@Autowired
	private UserRepository UserRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user=UserRepo.findByUsername(username);
		if(user==null)
		{
			throw new UsernameNotFoundException("User Not Found");
		}
		return new CustomUserDetails(user);
	}

	@Override
	public void addUser(User user) 
	{
		user.setPassword(PasswordEncoderUtil.encodePassword(user.getPassword()));
		UserRepo.save(user);
	}

	@Override
	public void deleteUser(String username) 
	{
		UserRepo.deleteById(username);		
	}

	@Override
	public List<User> viewUser(String username)
	{
		 return Collections.singletonList(UserRepo.findByUsername(username));
	}

	@Override
	public List<User> viewAllUser() 
	{
		return (List<User>) UserRepo.findAll();
	}

	@Override
	public void updateUser(User user) 
	{
		UserRepo.save(user);
	}

	@Override
	public User viewSingleUser(String username) 
	{
		
		return UserRepo.findByUsername(username);
	}
	
	
	

}
