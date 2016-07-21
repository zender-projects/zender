package com.zender.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.zender.dao.ResumeDao;
import com.zender.dao.basic.BaseDao;
import com.zender.domain.resume.Education;
import com.zender.domain.resume.Employment;
import com.zender.domain.resume.Skill;

@Repository("resumeDao")
public class ResumeDaoImpl extends BaseDao implements ResumeDao{

	public List<Employment> findEmploymentByUserId(Integer id) {
		
		List<Employment> employments = this.getSqlSession().selectList("employment.findByUserId", id); 
		
		return employments;
	}

	public List<Skill> findSkillByUserId(Integer id) {
		List<Skill> skills = this.getSqlSession().selectList("skill.findByUserId", id);
		return skills;
	}

	public List<Education> findEducationByUserId(Integer id) {
		List<Education> educations = this.getSqlSession().selectList("education.findByUserId", id);
		return educations;
	}
	
	

}
