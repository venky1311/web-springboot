package com.venky.converter;

import java.util.stream.Collectors;

import com.venky.dto.Userdto;
import com.venky.entity.User;

public class UserConverter 
{
	public static User dtoToEntity(Userdto userdto)
	{
		User user = new User(userdto.getUserName(), null);
		user.setUserId(userdto.getUserId());
		user.setSkills(userdto.getSkillsdto().stream().map(SkillConverter::dtoToEntity).collect(Collectors.toList()));
		return user;
		
	}
	
	public static Userdto EntityTodto(User user)
	{
		Userdto userdto = new Userdto();
		userdto.setSkillsdto(user.getSkills().stream().map(SkillConverter::EntitytoDto).collect(Collectors.toList()));
		return userdto;
	}

}
