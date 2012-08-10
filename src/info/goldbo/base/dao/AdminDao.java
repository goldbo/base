package info.goldbo.base.dao;

import info.goldbo.base.entity.Admin;

/**
 * Dao�ӿ�-����Ա
 * ==================================
 * @author huangjinbo
 * @email goldbo891218@gmail.com
 * 2012-8-10 ����3:07:52
 * ==================================
 */
public interface AdminDao extends BaseDao<Admin, String>{

	/**
	 * �����û����жϴ��û��Ƿ���ڣ������ִ�Сд��
	 * 
	 */
	public boolean isExistByUsername(String username);
	
	/**
	 * �����û�����ȡ����Ա����������Ա�����ڣ��򷵻�null�������ִ�Сд��
	 * 
	 */
	public Admin getAdminByUsername(String username);


}
