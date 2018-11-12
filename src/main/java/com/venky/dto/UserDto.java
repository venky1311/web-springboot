package com.venky.dto;

import com.venky.entity.User;

public class UserDto {
	
    Integer userId;
    String userName;
	String passWord;
    //List<SkillDto> skillDtos= new ArrayList<>();

    public UserDto(Integer userId, String userName, String passWord) {
        this.userId = userId;
        this.userName = userName;
        this.passWord = passWord;
    }
	
	public UserDto(User user)
	{
		this.userId = user.getUserId();
		this.userName = user.getUserName();
		this.passWord = user.getPassWord();
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

}
