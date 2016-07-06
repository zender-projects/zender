package zender.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zender.dao.UserDao;
import com.zender.domain.User;

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
	    
		UserDao dao = (UserDao)applicationContext.getBean("userDao");
	
	    User user = dao.findUserById(1);
	    
	    System.out.println(user);
	}
}
