package com.flexmanagement.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.flexmanagement.app.model.User;
import com.flexmanagement.app.service.UserServiceI;


@Controller
@RequestMapping(value="/Dashboard/")
public class UserController 
{
	@Autowired
	UserServiceI UserService;
	@RequestMapping(value="/addUserForm")
	public String addUser()
	{
		return "InsertUser";
	}
	@RequestMapping(value="/addUser")
	public String addUser(@ModelAttribute User user)
	{
		UserService.addUser(user);
		return "InsertUser";
	}
	@RequestMapping(value="/deleteUserForm")
	public String deleteUser()
	{
		return "DeleteUser";
	}
	@RequestMapping(value="/deleteUser")
	public String deleteUser(@RequestParam String username)
	{
		UserService.deleteUser(username);
		return "DeleteUser";
	}
	@RequestMapping(value="/updateUserForm")
	public String updateUser()
	{
		return "UpdateUser";
	}
	@RequestMapping(value="/retrieveUser")
	public String updateUser(@RequestParam String username,ModelMap m)
	{	User user =UserService.viewSingleUser(username);
		m.addAttribute("user",user);
		return "UpdateUser";
	}
	@RequestMapping(value="/updateUser")
	public String updateUser(@ModelAttribute User user)
	{	UserService.addUser(user);
		return "UpdateUser";
	}
	@RequestMapping(value="/viewUserForm")
	public String viewUser()
	{
		return "ViewUser";
	}
	@RequestMapping(value="/viewUser")
	public String viewUser(String username,ModelMap m)
	{
		List<User> UsersList =UserService.viewUser(username);
		m.addAttribute("userList",UsersList);
		return "ViewUser";
	}
	@RequestMapping(value="/viewAllUsers")
	public String viewUser(ModelMap m)
	{
		List<User> UsersList =UserService.viewAllUser();
		m.addAttribute("userList",UsersList);
		return "ViewUser";
	}

}
