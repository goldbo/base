package info.goldbo.base.service;

import info.goldbo.base.entity.Admin;

/**
 * serice�ӿ�-����Ա
 * ==================================
 * @author huangjinbo
 * @email goldbo891218@gmail.com
 * 2012-8-10 ����2:29:46
 * ==================================
 */
public interface AdminService extends BaseService<Admin, String>  {
	public Admin getLoginAdmin();

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
