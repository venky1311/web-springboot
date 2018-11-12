package com.venky.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.venky.dto.UserDto;
import com.venky.entity.User;

@Repository
public interface UserRepositoryDao extends CrudRepository<User, Integer> {

	User save(UserDto userDto);


}
