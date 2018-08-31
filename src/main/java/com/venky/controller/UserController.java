package com.venky.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.venky.dto.Userdto;
import com.venky.service.UserService;
import com.venky.utils.Constants;


@RequestMapping("/user")
@RestController
public class UserController 
{
	@Autowired
	UserService userservice;
	
	@RequestMapping(value =  Constants.GET_USER_BY_ID)
	public Userdto getUserbyId(@PathVariable Integer userId)
	{
		return userservice.getUserById(userId);
	}
	
	@RequestMapping(value = Constants.GET_ALL_USERS)
	public List <Userdto> getAllUsers()
	{
		return userservice.getAllUsers();
	}
	
	@RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
	public void saveUser(@RequestBody Userdto userdto)
	{
		userservice.saveUser(userdto);
	}
	

}
