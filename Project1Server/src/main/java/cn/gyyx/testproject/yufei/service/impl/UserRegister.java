/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午3:35:04
 * 版本号：v1.0
 * 本类主要用途叙述：注册业务实现类
 */



package cn.gyyx.testproject.yufei.service.impl;

import cn.gyyx.testproject.yufei.bean.UserKey;
import cn.gyyx.testproject.yufei.dao.IUserInfo;
import cn.gyyx.testproject.yufei.dao.IUserKey;
import cn.gyyx.testproject.yufei.dao.impl.UserInfoDao;
import cn.gyyx.testproject.yufei.dao.impl.UserKeyDao;
import cn.gyyx.testproject.yufei.service.IUserRegister;

public class UserRegister implements IUserRegister

{
	/**
	 * 插入userkey业务
	 */

	public void setUserKey(String username, String password, String pstring) {
		IUserKey iKey=new UserKeyDao();
		iKey.insertUserKey(username, password, pstring);
		
	}
/**
 * 插入userinfo业务
 */
	public void setUserInfo(int userid, String usersex, String userphone,
			int userstate) {
		IUserInfo info=new UserInfoDao();
		info.insertInfo(userid, usersex, userphone, userstate);
		
	}
public UserKey getUserKey(String username) {
	// TODO Auto-generated method stub
	IUserKey key=new UserKeyDao();
	return key.selectUserByUserName(username);
	
	
	
}

}
