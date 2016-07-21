package com.zender.service;

import java.util.List;

import com.zender.domain.resume.Education;
import com.zender.domain.resume.Employment;
import com.zender.domain.resume.Skill;

public interface ResumeService {

	/**
	 * ����userid ��ѯ��������
	 * */
	List<Employment> findEmploymentByUserId(Integer id);
	
	/**
	 * ����userid��ѯְҵ����
	 * */
	List<Skill> findSkillByUserId(Integer id);
	
	/**
	 * ����userid��ѯ��������
	 * */
	List<Education> findEducationByUserId(Integer id);
}
