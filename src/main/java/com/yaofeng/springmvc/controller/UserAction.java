package com.yaofeng.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserAction {
		
		@RequestMapping(value="/order/{id}",method=RequestMethod.DELETE)
		public int removeById(@PathVariable("id") String id) {
			System.out.println("----------");
			return 1;
			
		}
		
		@RequestMapping(value="/order/{id}",method=RequestMethod.PUT)
		public int updateById(@PathVariable("id") String id) {
			System.out.println("----------");
			return 1;
			
		}
	
}
