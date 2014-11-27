

/**
 * --------------------------------------------------- 
 * 版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日17:36:09
 *  版本号：v1.0
 * 本类主要用途叙述：user_key的Model 
 * 
 */
package cn.gyyx.testproject.yufei.bean;
public class UserKey {
	private Integer userId;
	private String userName;
	private String password;
	private String pString;

	/**
	 * 得到用户id
	 * @return userid
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * 用户id设置
	 * @param userId
	 */

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * 得到用户姓名
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * 设定用户姓名
	 * @param userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * 得到用户密码
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * 用户密码的设定
	 * @param password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * 得到神秘的的字符串
	 * @return pString
	 */
	public String getpString() {
		return pString;
	}

	/**
	 * 设定这个神秘的字符串
	 * @param pString
	 */
	public void setpString(String pString) {
		this.pString = pString;
	}

}
