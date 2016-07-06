package com.zender.dao.basic;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class BaseDao extends SqlSessionDaoSupport{
    
	@Resource
	private SqlSessionFactory sqlSessionFactory;
	
	@PostConstruct
	public void init(){
		this.setSqlSessionFactory(this.sqlSessionFactory);
	}
}
