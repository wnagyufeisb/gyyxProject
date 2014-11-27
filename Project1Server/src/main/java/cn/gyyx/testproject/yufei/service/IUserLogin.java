/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日上午9:36:41
 * 版本号：v1.0
 * 本类主要用途叙述：处理用户相关请求，包括登陆和注册
 */



package cn.gyyx.testproject.yufei.service;

import cn.gyyx.testproject.yufei.bean.UserKey;

public interface IUserLogin {
	/**
	 * 验证登录是否成功
	 * @param userName
	 * @param password
	 * @return boolean
	 */
	public boolean IsLogin(String userName,String password);
	/**
	 * 通过账号得到用户的主要信息
	 * @param username
	 * @return UserKey
	 */
	public UserKey getUserKeyByUserName(String username);

}
