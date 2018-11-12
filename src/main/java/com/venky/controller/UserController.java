package com.venky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.venky.entity.User;
import com.venky.repository.UserRepositoryDao;
import com.venky.service.UserService;

@RestController
@RequestMapping(value="/res")
public class UserController {

	@Autowired
	UserService userService;

	@Autowired
	UserRepositoryDao userRepository;

	/*
	 * @RequestMapping(Constants.GET_USER_BY_ID) public UserDto
	 * getUserById(@PathVariable Integer userId) { return
	 * userService.getUserById(userId); }
	 * 
	 * @RequestMapping(Constants.GET_ALL_USERS) public List<UserDto> getAllUsers() {
	 * return userService.getAllUsers(); }
	 * 
	 * 
	 * 	@RequestMapping(value= Constants.SAVE_USER, method= RequestMethod.POST)
	public void saveUser(@RequestBody UserDto userDto) {
		userService.saveUser(userDto);
	 */

	@PostMapping(value="/employee")
	public User saveUser(User user) {
		System.out.println("Creating employee's "+user.getUserName());

		return userService.saveUser(user);
	}
	
	@GetMapping(value="/employee/{empid}")
	public User GetUserByID(@PathVariable("userId")Integer userId )
	{
		return userService.getUserById(userId);
	}
}
