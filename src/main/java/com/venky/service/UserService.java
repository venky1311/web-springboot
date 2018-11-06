package com.venky.service;

import java.util.List;

import com.venky.dto.UserDto;
import com.venky.entity.User;

public interface UserService 
{
	 User saveUser(UserDto userDto);
	 
	 UserDto getUserById(Integer userId);
	   
	 List<UserDto> getAllUsers();
 
}
