package com.zender.web.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zender.constants.PageView;
import com.zender.service.PageViewService;
import com.zender.web.util.WebUtils;

/**
 * 页面跳转Controller
 * */
@Controller
public class PageJumpController {

	/**
	 * 简历主页
	 * */
	private static Logger logger = Logger.getLogger(PageJumpController.class);
	
	@Resource
    private PageViewService pageViewService;
	
	@RequestMapping(value = "/resume/index.htm")
	public String resumeIndex(HttpServletRequest request){
		
		Map<String, String> pv = WebUtils.getAgentInfo(PageView.RESUME_INDEX.toString(), request);
		logger.info(pv.toString());
		pageViewService.insert(pv);
		
		return "/resume/index.html";
	}
	
	@RequestMapping(value="/resume/contact.htm")
	public String resumeContact(HttpServletRequest request){
		Map<String, String> pv = WebUtils.getAgentInfo(PageView.RESUME_CONTACT.toString(), request);
		logger.info(pv.toString());
		pageViewService.insert(pv);
		
		return "/resume/contact.html";
	}
	
	@RequestMapping(value="/resume/map.htm")
	public String resumeMap(HttpServletRequest request){
		Map<String, String> pv = WebUtils.getAgentInfo(PageView.RESUME_MAP.toString(), request);
		logger.info(pv.toString());
		pageViewService.insert(pv);
		
		return "/resume/map.html";
	}
}
