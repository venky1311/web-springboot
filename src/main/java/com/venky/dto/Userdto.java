package com.venky.dto;

import java.util.ArrayList;
import java.util.List;

public class Userdto 
{
	Integer UserId;
	String UserName;
	List<Skillsdto> skillsdto = new ArrayList<>();
	
	public Userdto(Integer userId, String userName, List<Skillsdto> skillsdto)
	{
		this.UserId = userId;
		this.UserName = userName;
		this.skillsdto = skillsdto;
	}
	
	public Userdto()
	{
		
	}
	
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(Integer userId) {
		UserId = userId;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}

	public List<Skillsdto> getSkillsdto() {
		return skillsdto;
	}

	public void setSkillsdto(List<Skillsdto> skillsdto) {
		this.skillsdto = skillsdto;
	}
	

}
