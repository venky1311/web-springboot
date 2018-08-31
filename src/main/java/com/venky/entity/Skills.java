package com.venky.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Skills 
{
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private Integer SkillId;
	
	@Column
	private String SkillName;
	
	@ManyToOne
	private User user;
	
	public Skills(String skillName)
	{
		this.SkillName = skillName;
	}
	
	public Integer getSkillId() {
		return SkillId;
	}

	public void setSkillId(Integer skillId) {
		SkillId = skillId;
	}

	public String getSkillName() {
		return SkillName;
	}

	public void setSkillName(String skillName) {
		SkillName = skillName;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public Skills()
	{
		
	}
	
	public Skills(String skillName, User user)
	{
		this.SkillName=skillName;
		this.user = user;
	}
	
	

}
