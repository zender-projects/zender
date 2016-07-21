package com.zender.service.impl;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;
import com.zender.dao.ResumeDao;
import com.zender.domain.resume.Education;
import com.zender.domain.resume.Employment;
import com.zender.domain.resume.Skill;
import com.zender.service.ResumeService;


@Service("resumeService")
public class ResumeDaoImpl implements ResumeService{

	@Resource
	private ResumeDao resumeDao;
	
	public List<Employment> findEmploymentByUserId(Integer id) {
		return resumeDao.findEmploymentByUserId(id);
	}

	public List<Skill> findSkillByUserId(Integer id) {
		return resumeDao.findSkillByUserId(id);
	}

	public List<Education> findEducationByUserId(Integer id) {
		// TODO Auto-generated method stub
		return resumeDao.findEducationByUserId(id);
	}

}
