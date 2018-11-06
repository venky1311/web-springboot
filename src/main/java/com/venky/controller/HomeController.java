package com.venky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login()
	{
		return "login.html";
	}
}
