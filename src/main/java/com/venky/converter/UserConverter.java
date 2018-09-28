package com.venky.converter;

import java.util.stream.Collectors;

import com.venky.dto.UserDto;
import com.venky.entity.User;

public class UserConverter {
	public static User dtoToEntity(UserDto userDto) {
		User user = new User(userDto.getUserName(),userDto.getPassWord(), null);
		user.setUserId(userDto.getUserId());
		user.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
	}

	public static UserDto entityToDto(User user) {
		UserDto userDto = new UserDto(user.getUserId(), user.getUserName(),user.getPassWord(), null);
		userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return userDto;
	}
}
