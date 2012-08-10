package info.goldbo.base.service.impl;

import info.goldbo.base.dao.AdminDao;
import info.goldbo.base.entity.Admin;
import info.goldbo.base.service.AdminService;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

/**
 * serviceʵ����-����Ա
 * ==================================
 * @author huangjinbo
 * @email goldbo891218@gmail.com
 * 2012-8-10 ����2:29:24
 * ==================================
 */

@Service
public class AdminServiceImpl extends BaseServiceImpl<Admin, String> implements AdminService {

	@Resource
	private AdminDao adminDao;

	@Resource
	public void setBaseDao(AdminDao adminDao) {
		super.setBaseDao(adminDao);
	}
	
	@Override
	public Admin getLoginAdmin() {
		System.out.println("Success!");
		return null;
	}
	
	public boolean isExistByUsername(String username) {
		return adminDao.isExistByUsername(username);
	}
	
	public Admin getAdminByUsername(String username) {
		return adminDao.getAdminByUsername(username);
	}

}
