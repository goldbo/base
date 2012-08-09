package info.goldbo.base;

import org.hibernate.Session;
import org.junit.Test;

public class HibernateTest {
	
	@Test
	public void testBulid(){
		Session session = HibernateSessionFactory.getSession();
		System.out.println(session);
	}
}
