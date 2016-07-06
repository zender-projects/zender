package com.zender.web.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zender.domain.User;
import com.zender.service.UserService;

@Controller
public class UserController {
	
	private static final Log logger = LogFactory.getLog(UserController.class);
	
	@Resource
	private UserService userService;
	
	public UserController() {
		// TODO Auto-generated constructor stub
		logger.info("Init UserController");
		
	}
	
	
	@RequestMapping(value="/user/find_user")
	public String findUserById(HttpServletResponse response){
		User user = userService.findUserById(1);
		System.out.println(user);
		
		return "";
	}

}
