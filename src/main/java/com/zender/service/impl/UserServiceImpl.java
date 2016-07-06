package com.zender.service.impl;

import javax.annotation.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import com.zender.dao.UserDao;
import com.zender.domain.User;
import com.zender.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	private static final Log logger = LogFactory.getLog(UserServiceImpl.class);
	
	public UserServiceImpl() {
		logger.info("Init UserServieImpl");
	}
	
	@Resource
	private UserDao userDao;

	public User findUserById(int id) {
		return userDao.findUserById(id);
	}

}
