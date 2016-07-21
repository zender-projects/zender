package com.zender.dao;

import java.util.List;

import com.zender.domain.resume.Education;
import com.zender.domain.resume.Employment;
import com.zender.domain.resume.Skill;

public interface ResumeDao {
    
	 /**
	  * ����userid��ѯ��������
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
