/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午7:09:11
 * 版本号：v1.0
 * 本类主要用途叙述：实现从数据库中查询Userkey的接口
 */



package cn.gyyx.testproject.yufei.dao;



import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.gyyx.testproject.yufei.bean.ListTemp;
import cn.gyyx.testproject.yufei.bean.UserKey;

public interface IUserKey {
	/**
	 * 判断是否存在该用户
	 * @param username
	 * @return boolean
	 */
	public boolean IsUser(String username);
	
	/**
	 * 通过账户检索用户主要信息
	 * @param userName
	 * @return UserKey
	 */
	public UserKey selectUserByUserName(@Param("username")String username);

	/**
	 * 插入一条userkey的记录
	 * @param username
	 * @param password
	 * @param pstring
	 */
 public void insertUserKey(@Param("userName")String username,@Param("password")String password,@Param("pString")String pstring);
 /**
  * 查询记录的数量
  * @return int 
  */
 public int selectNumberUser();


}



