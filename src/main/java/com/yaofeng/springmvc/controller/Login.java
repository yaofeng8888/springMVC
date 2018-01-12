package com.yaofeng.springmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;

@Controller
public class Login {

	/*@RequestMapping(value="/" ,method=RequestMethod.GET)
	 * 原生的API
	public String hello(HttpServletRequest request) {
		request.setAttribute("name", "yaofeng");
		return "login";
	}*/
	@RequestMapping(value="/" ,method=RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("name", "hyy");
		return "login";
	}
	
	@RequestMapping(value="/json" ,method=RequestMethod.GET)
	public void json(HttpServletRequest request,HttpServletResponse response,
			HttpSession session) throws Exception {
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("name","张三");
		map.put("age", 13);
		PrintWriter out = response.getWriter();
		String jsonString = JSON.toJSONString(map);
		out.print(jsonString);
		out.flush();
		out.close();
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
