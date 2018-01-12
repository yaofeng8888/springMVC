package com.yaofeng.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Login {

	/*@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String hello(HttpServletRequest request) {
		request.setAttribute("name", "yaofeng");
		return "login";
	}*/
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("name", "hyy");
		return "login";
	}
	
	@RequestMapping(value="/user/login",method=RequestMethod.POST)
	public String login(User user) {
		System.out.println(user.getUsername()+"--"+user.getPassword()+"--"+user.getAddr().getPro()+"--"+user.getAddr().getCity());
		return "success";
	}
	
	
	@RequestMapping(value="/user/{userid}",method=RequestMethod.GET)
	public User getById(@PathVariable("userid")String id) {
		System.out.println("id="+id);
		return null;
		
	}
}
