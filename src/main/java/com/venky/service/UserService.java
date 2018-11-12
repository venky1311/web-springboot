package com.venky.service;


import com.venky.entity.User;

public interface UserService 
{
	User saveUser(User user);

	 User getUserById(Integer userId);
	   
	 /*List<UserDto> getAllUsers();*/
 
}
