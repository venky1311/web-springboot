package com.venky.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User implements Serializable
{
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer UserId;
	
	@Column
	private String UserName;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	private List<Skills> skills = new ArrayList<>();
	
	

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

	public List<Skills> getSkills() {
		return skills;
	}

	public void setSkills(List<Skills> skills) {
		this.skills = skills;
	}
	
	public User()
	{
		
	}
	
	public User(String userName, List<Skills> skills)
	{
		this.UserName = userName;
		this.skills = skills;
		
	}
	
	

}
