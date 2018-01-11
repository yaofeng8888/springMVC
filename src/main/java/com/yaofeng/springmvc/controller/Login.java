package com.yaofeng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Login {

	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String hello() {
		return "login";
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public String login(@RequestParam("username")String name,@RequestParam("password")String pass) {
		System.out.println(name+"----------"+pass);
		return "success";
	}
}
