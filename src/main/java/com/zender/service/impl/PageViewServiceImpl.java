package com.zender.service.impl;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zender.dao.PageViewDao;
import com.zender.service.PageViewService;

@Service("pageViewService")
public class PageViewServiceImpl implements PageViewService{
	
	@Resource
	private PageViewDao pageViewDao;

	public int insert(Map<String, String> pv) {
		return pageViewDao.insert(pv);
	}

}
