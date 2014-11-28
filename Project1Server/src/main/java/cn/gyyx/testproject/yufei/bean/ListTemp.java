/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月28日上午11:31:00
 * 版本号：v1.0
 * 本类主要用途叙述 :List表中创建的临时对象
 */


package cn.gyyx.testproject.yufei.bean;

public class ListTemp {

	private String userName;
	private int userId;
	private String userSex;
	private String userPhone;
/**
 * 获得用户名字
 * @return userName
 */
	public String getUserName() {
		return userName;
	}
/**
 * 设置用户姓名
 * @param userName
 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
/**
 * 得到用户id
 * @return userId
 */
	public int getUserId() {
		return userId;
	}
/**
 * 设定用户Id
 * @param userId
 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
/**
 * 得到用户的性别
 * @return userSex
 */
	public String getUserSex() {
		return userSex;
	}
/**
 * 设定用户的性别
 * @param userSex
 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
/**
 * 的到用户的电话
 * @return userPhone
 */
	public String getUserPhone() {
		return userPhone;
	}
/**
 * 设定用户的电话
 * @param userPhone
 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
}
