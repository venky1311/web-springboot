package com.venky.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/login")
	public String login()
	{
		return "login.html";
	}
}
