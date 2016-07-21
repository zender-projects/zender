package zender.test;

import java.util.List;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zender.constants.PageView;
import com.zender.dao.ResumeDao;
import com.zender.dao.UserDao;
import com.zender.domain.User;
import com.zender.domain.resume.Employment;
import com.zender.web.util.WebUtils;

public class ProjectTest {

	
	
	
	/**
	 * 测试数据库连接池配置
	 * */
	//@Test
	public void testOne() throws Exception{
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	    
		DataSource ds = (DataSource)applicationContext.getBean("dataSource");
		
		System.out.println(ds.getConnection());
	
	}
	
	/**
	 * 测试spring 集成mybatis
	 * */
	@Test
	public void testTwo(){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	    
		ResumeDao dao = (ResumeDao)applicationContext.getBean("resumeDao");
	
	    List<Employment> user = dao.findEmploymentByUserId(1);
	    
	    System.out.println(user.size());
	}
	
	/**
	 * 
	 * */
	//@Test
	public void testThree(){
		System.out.println(WebUtils.getCurrentTime());
		System.out.println(PageView.RESUME_INDEX.values()[0]);
	}
}
