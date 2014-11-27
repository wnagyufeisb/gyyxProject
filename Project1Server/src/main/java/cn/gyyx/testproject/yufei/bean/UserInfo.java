/**
 * --------------------------------------------------- 
 * 版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午6:06:54
 * 版本号：v1.0
 * 本类主要用途叙述：创建user_info的Model
 */



package cn.gyyx.testproject.yufei.bean;

public class UserInfo {
	private int userId;
	private String userSex;
	private String userPhone;
	private int userState;

	/**
	 * 
	 * 得到用户的id
	 * 
	 * @return userid
	 */
	public int getUserId() {
		return userId;
	}

	/**
	 * 设定用户的id
	 * 
	 * @param userId
	 */

	public void setUserId(int userId) {
		this.userId = userId;
	}

	/**
	 * 得到用户的性别
	 * 
	 * @return usersex
	 */
	public String getUserSex() {
		return userSex;
	}

	/**
	 * 设定用户的性别
	 * 
	 * @param userSex
	 */
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	/**
	 * 得到用户的电话号码
	 * 
	 * @return userPhone
	 */
	public String getUserPhone() {
		return userPhone;
	}

	/**
	 * 设定用户的电话号码
	 * 
	 * @param userPhone
	 */
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	/**
	 * 得到当前用户的状态
	 * 
	 * @return userState
	 */
	public int getUserState() {
		return userState;
	}

	/**
	 * 用户状态的设定
	 * 
	 * @param userState
	 */
	public void setUserState(int userState) {
		this.userState = userState;
	}

}
