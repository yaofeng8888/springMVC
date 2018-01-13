package com.yaofeng.springmvc.controller;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


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
	
	/*@RequestMapping(value="/json" ,method=RequestMethod.GET)
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
	}*/
	@ResponseBody
	@RequestMapping(value="/json2" ,method=RequestMethod.GET)
	public Map<String,Object> json2(){
		Map<String,Object>map = new HashMap<String,Object>();
		map.put("name","张三");
		map.put("age", 13);
		return map;
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
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String test() {
		return "test";
	}
	
	@RequestMapping(value="/test1",method=RequestMethod.GET)
	public String test1() {
		
		return"upload";
	}
	//文件上传
	/*@RequestMapping(value="/upload",method=RequestMethod.POST)
	public String upload(@RequestParam("name")String name,@RequestParam("file")
			MultipartFile file) throws Exception, Exception {
		System.out.println("name="+name);
		if(!file.isEmpty()) {
			file.transferTo(new File("E:/"+file.getOriginalFilename()));
		}
		return "uploadsuccess";
		
	}*/
	@RequestMapping(value = "/upload", method = RequestMethod.POST)
	public String upload(@RequestParam("name") String name, @RequestParam("file") MultipartFile file) throws Exception {
		System.out.println("+++++++++++++++"+name);
		if(!file.isEmpty()){
			file.transferTo(new File("d:/"+file.getOriginalFilename()));
		}
		return "uploadsuccess";
	}
	
	
	
	
}
