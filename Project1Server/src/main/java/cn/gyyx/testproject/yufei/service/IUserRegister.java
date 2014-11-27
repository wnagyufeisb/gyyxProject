/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午3:33:03
 * 版本号：v1.0
 * 本类主要用途叙述：注册的业务层
 */



package cn.gyyx.testproject.yufei.service;

import cn.gyyx.testproject.yufei.bean.UserKey;

public interface IUserRegister {
	/**
	 * 插入一条userKey
	 * @param username
	 * @param password
	 * @param pstring
	 */
	public void setUserKey(String username,String password,String pstring);
	/**
	 * 插入一条userinfo
	 * @param userid
	 * @param usersex
	 * @param userphone
	 * @param userstate
	 */
	public void setUserInfo(int userid,String usersex,String userphone,int userstate);
	/**
	 * 查询一个userKey
	 * @param username
	 */
	public UserKey  getUserKey(String username);

}
