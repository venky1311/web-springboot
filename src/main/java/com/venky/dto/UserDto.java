package com.venky.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    Integer userId;
    String userName;
	String passWord;
    List<SkillDto> skillDtos= new ArrayList<>();

    public UserDto(Integer userId, String userName, String passWord, List<SkillDto> skillDtos) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
        this.skillDtos = skillDtos;
    }

    public UserDto() {
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

    public List<SkillDto> getSkillDtos() {
        return skillDtos;
    }

    public void setSkillDtos(List<SkillDto> skillDtos) {
        this.skillDtos = skillDtos;
    }
}
