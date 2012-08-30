package info.goldbo.base;

import info.goldbo.base.entity.Admin;
import info.goldbo.base.service.AdminService;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
		System.out.println(admin.getId());
	}
	
	@Test
	public void testUpdate(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService adminService = (AdminService) context.getBean("adminServiceImpl");
		Admin admin = adminService.load("297e0cc1390b92a301390b92ac6c0001");
		//System.out.println(admin.getId());
		admin.setPassword("123456");
		//adminService.update(admin);
	}
	
	@Test
	public void testSession(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sf = (SessionFactory)context.getBean("sessionFactory");
		Session session = sf.openSession();
		session.beginTransaction();
		Admin admin = (Admin)session.load(Admin.class, "297e0cc1390b92a301390b92ac6c0001");
		admin.setEmail("admin@qq.com");
		session.getTransaction().commit();
		session.close();
	}
	
	@Test
	public void testList(){
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AdminService adminService = (AdminService) context.getBean("adminServiceImpl");
		List<Admin> list = adminService.getAll();
		if(list!=null){
			for (Admin admin : list) {
				admin.setDepartment("test_department");
				adminService.update(admin);
			}
		}
	}
}
