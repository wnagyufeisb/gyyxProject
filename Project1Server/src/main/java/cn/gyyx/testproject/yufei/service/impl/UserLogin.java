/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日上午9:41:25
 * 版本号：v1.0
 * 本类主要用途叙述：用户登录的的业务实现类
 */



package cn.gyyx.testproject.yufei.service.impl;

import cn.gyyx.testproject.yufei.bean.UserKey;
import cn.gyyx.testproject.yufei.dao.IUserKey;
import cn.gyyx.testproject.yufei.dao.impl.UserKeyDao;
import cn.gyyx.testproject.yufei.service.IUserLogin;

public class UserLogin implements IUserLogin {

	public boolean IsLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * 得到登录用户的信息
	 */
	public UserKey getUserKeyByUserName(String username) {
		// TODO Auto-generated method stub
	  UserKeyDao userkeydao=new UserKeyDao();
	;
	  UserKey userkey=userkeydao.selectUserByUserName(username);
	
	  return userkey;
	}
	

}
