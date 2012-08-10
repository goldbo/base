package info.goldbo.base.dao;

import info.goldbo.base.entity.Admin;

/**
 * Dao接口-管理员
 * ==================================
 * @author huangjinbo
 * @email goldbo891218@gmail.com
 * 2012-8-10 下午3:07:52
 * ==================================
 */
public interface AdminDao extends BaseDao<Admin, String>{

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
