package info.goldbo.base;

import info.goldbo.base.entity.Admin;
import info.goldbo.base.service.AdminService;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SpringTest  {

	@Test
	public void testBuild() throws Exception {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Assert.assertTrue(context.containsBean("baseDaoImpl"));
	}
	
	@Test
	public void testAdminService(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService adminService = (AdminService) context.getBean("adminServiceImpl");
		boolean isExist = adminService.isExistByUsername("admin");
		Assert.assertTrue(isExist);
	}
	
	@Test
	public void testBaseDao(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService adminService = (AdminService) context.getBean("adminServiceImpl");
		Admin admin = adminService.load("402881d6390e44b001390e44b1720001");
		System.out.println(admin.getId());
	}
	
	@Test
	public void testAdd(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService adminService = (AdminService) context.getBean("adminServiceImpl");
		Admin admin = new Admin();
		admin.setName("huangjinbo");
		admin.setUsername("huang");
		admin.setPassword("123456");
		adminService.save(admin);
	}
	
	@Test
	public void testUpdate(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService adminService = (AdminService) context.getBean("adminServiceImpl");
		Admin admin = adminService.load("402881d6390fc05e01390fc0636a0001");
		//System.out.println(admin.getId());
		admin.setPassword("123456");
		//adminService.update(admin);
	}
}
