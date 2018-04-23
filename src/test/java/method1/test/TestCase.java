package method1.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import method1.dao.EmpDao;
import method1.entity.Emp;

public class TestCase {

	
	private ApplicationContext ac;
	EmpDao dao;
	@Before
	public void init() {
		ac = new ClassPathXmlApplicationContext("mybatis_spring.xml");
		dao = ac.getBean("empDao",EmpDao.class);
		
	}
	@Test
	public void test1() {
		Emp emp = new Emp();
		emp.setId("wuwu");
		emp.setName("ºêÎ°");
		emp.setPassword("123456");
		dao.save(emp);
	}
	@Test
	public void test2() {
		List<Emp> empList = dao.findAll();
		System.out.println(empList);
		
		
	}
		
}
