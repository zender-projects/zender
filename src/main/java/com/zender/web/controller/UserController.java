package com.zender.web.controller;

import javax.annotation.Resource; 
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.zender.domain.User;
import com.zender.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Log logger = LogFactory.getLog(UserController.class);
	
	@Resource
	private UserService userService;
	
	public UserController() {
		// TODO Auto-generated constructor stub
		logger.info("Init UserController");
		
	}
	
	
	@RequestMapping(value="/find_user")
	public String findUserById(HttpServletResponse response){
		User user = userService.findUserById(1);
		System.out.println(user);
		return "";
	}
	
	
	/**
	 * RESTful API
	 * */
	
	
	@RequestMapping(value = "/get/{id}", method=RequestMethod.GET)
	@ResponseBody
	public User getUserInfoById(@PathVariable int id){
		User user = userService.findUserById(id);
		logger.info(user);
		return user;
	}
	
	
	@RequestMapping(value="/put/{id}", method=RequestMethod.PUT,
			    headers="Content-Type=application/json")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void updateUser(@PathVariable String id, @RequestBody User user){
		logger.info("update user:" + user);
	}

}
