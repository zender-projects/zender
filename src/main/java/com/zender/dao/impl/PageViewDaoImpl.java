package com.zender.dao.impl;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.zender.dao.PageViewDao;
import com.zender.dao.basic.BaseDao;

@Repository("pageViewDao")
public class PageViewDaoImpl extends BaseDao implements PageViewDao{

	public int insert(Map<String, String> pv) {
		return this.getSqlSession().insert("page_view.insertPV", pv);
	}

}
