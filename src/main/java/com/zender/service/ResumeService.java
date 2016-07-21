package com.zender.service;

import java.util.List;

import com.zender.domain.resume.Education;
import com.zender.domain.resume.Employment;
import com.zender.domain.resume.Skill;

public interface ResumeService {

	/**
	 * 根据userid 查询工作经历
	 * */
	List<Employment> findEmploymentByUserId(Integer id);
	
	/**
	 * 根据userid查询职业技能
	 * */
	List<Skill> findSkillByUserId(Integer id);
	
	/**
	 * 根据userid查询教育背景
	 * */
	List<Education> findEducationByUserId(Integer id);
}
