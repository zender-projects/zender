package com.zender.dao.impl;

import org.springframework.stereotype.Repository;

import com.zender.dao.UserDao;
import com.zender.dao.basic.BaseDao;
import com.zender.domain.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDao implements UserDao{
	
	

	public User findUserById(int id) {
		
		return this.getSqlSession().selectOne("user.findUserById", id);
	}

}
