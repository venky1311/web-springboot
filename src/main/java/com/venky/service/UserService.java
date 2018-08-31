package com.venky.service;

import java.util.List;

import com.venky.dto.Userdto;

public interface UserService 
{
	Userdto getUserById(Integer Id);
	
	void saveUser(Userdto userdto);
	
	List<Userdto> getAllUsers();
 
}
