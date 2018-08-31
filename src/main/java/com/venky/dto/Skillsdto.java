package com.venky.dto;

public class Skillsdto
{
	Integer SkillsId;
	String SkillsName;
	
	public Skillsdto(Integer SkillsId, String SkillsName)
	{
		this.SkillsId=SkillsId;
		this.SkillsName=SkillsName;
	}
	
	public Skillsdto()
	{
		
	}
	
	public Integer getSkillsId() {
		return SkillsId;
	}
	public void setSkillsId(Integer skillsId) {
		SkillsId = skillsId;
	}
	public String getSkillsName() {
		return SkillsName;
	}
	public void setSkillsName(String skillsName) {
		SkillsName = skillsName;
	}
	

}
