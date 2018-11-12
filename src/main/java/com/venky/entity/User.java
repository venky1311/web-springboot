package com.venky.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="UserTable")
public class User implements Serializable{

    private static final long serialVersionUID = 0x62A6DA99AABDA8A8L;
	
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="User_Id")
	private Integer userId;
	
    @Column(name="User_Name")
    private String userName;
    
    @Column(name="PassWord")
    private String passWord;
    
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
	
	  public User(Integer userId, String userName, String passWord) {
	        this.userId = userId;
	        this.userName = userName;
	        this.passWord = passWord;
	    }
	  
	  public User(User user)
		{
			this.userId = user.getUserId();
			this.userName = user.getUserName();
			this.passWord = user.getPassWord();
		}
	  
	  public User()
		{
		}

}
