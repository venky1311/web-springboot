package com.venky.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.venky.service.UserRepository;

@SpringBootApplication
public class BootDemoApplication 
{
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) 
	{
		SpringApplication.run(BootDemoApplication.class, args);

	}

}
