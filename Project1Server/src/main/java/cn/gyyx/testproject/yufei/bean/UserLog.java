/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午6:16:56
 * 版本号：v1.0
 * 本类主要用途叙述：user_log的Model
 */



package cn.gyyx.testproject.yufei.bean;

public class UserLog {
	private int code;
	private String userName;
	private String userLoadDate;
	private String userIP;
	/**
	 * 得到日志编号
	 * @return code
	 */
	public int getCode() {
		return code;
	}
	/**
	 * 设定日志编号
	 * @param code
	 */
	public void setCode(int code) {
		this.code = code;
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
	 * 得到用户的登录时间
	 * @return userLoadDate
	 */
	public String getUserLoadDate() {
		return userLoadDate;
	}
	/**
	 * 用户登录时间的设定
	 * @param userLoadDate
	 */
	public void setUserLoadDate(String userLoadDate) {
		this.userLoadDate = userLoadDate;
	}
	/**
	 * 得到用户的IP地址
	 * @return userIP
	 */
	public String getUserIP() {
		return userIP;
	}
	/**
	 * 修改用户的IP
	 * @param userIP
	 */
	public void setUserIP(String userIP) {
		this.userIP = userIP;
	}

}
