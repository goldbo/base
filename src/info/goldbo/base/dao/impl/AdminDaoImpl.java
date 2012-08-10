package info.goldbo.base.dao.impl;

import info.goldbo.base.dao.AdminDao;
import info.goldbo.base.entity.Admin;

import org.springframework.stereotype.Repository;

/**
 * Dao实现类-管理员
 * ==================================
 * @author huangjinbo
 * @email goldbo891218@gmail.com
 * 2012-8-10 下午3:08:45
 * ==================================
 */

@Repository
public class AdminDaoImpl extends BaseDaoImpl<Admin, String> implements AdminDao {

	@Override
	public boolean isExistByUsername(String username) {
		String hql = "from Admin admin where lower(admin.username) = lower(?)";
		Admin admin = (Admin) getSession().createQuery(hql).setParameter(0, username).uniqueResult();
		if (admin != null) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Admin getAdminByUsername(String username) {
		return null;
	}
	
}
