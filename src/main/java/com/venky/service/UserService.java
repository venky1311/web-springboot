package com.venky.service;

import java.util.List;

import com.venky.dto.UserDto;

public interface UserService 
{
		UserDto getUserById(Integer userId);
	    void saveUser(UserDto userDto);
	    List<UserDto> getAllUsers();
 
}
