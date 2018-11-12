package com.venky.serviceimpl;

import java.util.HashMap;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.venky.entity.User;
import com.venky.repository.UserRepositoryDao;
import com.venky.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	private static final Map<Integer, User> empMap = new HashMap<Integer, User>();
	
	@Autowired
	UserRepositoryDao userRepositoryDao;

	@Override
	public User getUserById(Integer userId) {
		return userRepositoryDao.findOne(userId);
	}

	@Override
	public User saveUser(User user) {
		//User us = new User(userForm.getUserId(), userForm.getUserName(), userForm.getPassWord());
		//us.setUserId(userForm.getUserId());
		/*empMap.put(us.getUserId(), userForm);*/
		return userRepositoryDao.save(user);
	}

	
	/*@Override
	public User saveUser(UserDto userDto) {
		userRepository.save(UserConverter.dtoToEntity(userDto));
	}*/

	/*@Override
	public List<UserDto> getAllUsers() {
		return userRepository.findAll().stream().map(UserConverter::entityToDto).collect(Collectors.toList());
	}*/

}
