package com.flexmanagement.app.service;

import java.util.List;

import com.flexmanagement.app.model.User;

public interface UserServiceI 
{
	public void addUser(User user);
	public void deleteUser(String username);
	public List<User> viewUser(String username);
	public List<User> viewAllUser();
	public void updateUser(User user);
	public User viewSingleUser(String username);

}
