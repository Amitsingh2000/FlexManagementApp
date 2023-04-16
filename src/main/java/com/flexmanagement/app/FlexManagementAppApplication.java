package com.flexmanagement.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flexmanagement.app.model.User;
import com.flexmanagement.app.service.CustomUserDetailsService;

@SpringBootApplication
public class FlexManagementAppApplication implements CommandLineRunner
{
	@Autowired
	CustomUserDetailsService UserService;
	public static void main(String[] args) {
		SpringApplication.run(FlexManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception
	{
		UserService.addUser(new User("Admin","admin","ADMIN"));
		UserService.addUser(new User("User","user","USER"));
	}

}
