package com.zender.web.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zender.domain.resume.Education;
import com.zender.domain.resume.Employment;
import com.zender.domain.resume.Skill;
import com.zender.service.ResumeService;
import com.zender.web.util.WebUtils;

/**
 * 简历  restful Api
 * @author zender
 * */
@Controller
public class ResumeController {

	private static Logger logger = Logger.getLogger(ResumeController.class);
	@Resource
	private ResumeService resumeService;
	
	/**
	 * 根据userid获取工作经历
	 * */
	
	@RequestMapping(value="/resume/employment/{id}", method=RequestMethod.GET)
	@ResponseBody
	public List<Employment> getEmploymentByUserId(@PathVariable Integer id){
		logger.info("ResumeController -> getEmploymentByUserId():" + WebUtils.getCurrentTime());
		return resumeService.findEmploymentByUserId(id);
	}
	
	/**
	 * 根据userid获取职业技能
	 * */
	@RequestMapping(value="/resume/skill/{id}", method=RequestMethod.GET)
	@ResponseBody
	public List<Skill> getSkillByUserId(@PathVariable Integer id){
		logger.info("ResumeController -> getSkillByUserId():" + WebUtils.getCurrentTime());
		return resumeService.findSkillByUserId(id);
	}
	
	/**
	 * 根据userid查询教育背景
	 * */
	
	@RequestMapping(value="/resume/education/{id}", method=RequestMethod.GET)
	@ResponseBody
	public List<Education> getEducationByUserId(@PathVariable Integer id){
		logger.info("ResumeController -> getEducationByUserId():" + WebUtils.getCurrentTime());
		return resumeService.findEducationByUserId(id);
	}
	
	/**
	 * 简历下载
	 * */
	@RequestMapping("/resume/download/{id}")
	public void resumeDownload(HttpServletRequest request, HttpServletResponse response,  @PathVariable String id){

		response.setCharacterEncoding("UTF-8");
		response.setHeader("Content-Disposition", "attachment; filename=CV_Zender_JavaEnginner.doc");
	    
		String path = request.getServletContext().getRealPath("/WEB-INF/resume/1.doc");
		FileInputStream fis = null;
		OutputStream os = null; 
		try {
			fis = new FileInputStream(path);
			os = response.getOutputStream();
			int len = 0;
			byte[] bs = new byte[fis.available()];
			fis.read(bs);
			os.write(bs);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(fis != null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
