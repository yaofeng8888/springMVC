package com.yaofeng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class User {

	//»Î√≈≥Ã–Ú
	@RequestMapping("/login")
	public String hello() {
		// WEB-INF/jsps/hi.jsp
		return "login";
	}

}
