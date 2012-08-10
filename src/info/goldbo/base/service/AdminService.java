package info.goldbo.base.service;

import info.goldbo.base.entity.Admin;

/**
 * serice接口-管理员
 * ==================================
 * @author huangjinbo
 * @email goldbo891218@gmail.com
 * 2012-8-10 下午2:29:46
 * ==================================
 */
public interface AdminService extends BaseService<Admin, String>  {
	public Admin getLoginAdmin();

	/**
	 * 根据用户名判断此用户是否存在（不区分大小写）
	 * 
	 */
	public boolean isExistByUsername(String username);
	
	/**
	 * 根据用户名获取管理员对象，若管理员不存在，则返回null（不区分大小写）
	 * 
	 */
	public Admin getAdminByUsername(String username);
}
