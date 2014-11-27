/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午7:09:52
 * 版本号：v1.0
 * 本类主要用途叙述：userinfo的接口
 */



package cn.gyyx.testproject.yufei.dao;



import org.apache.ibatis.annotations.Param;

import cn.gyyx.testproject.yufei.bean.UserKey;

public interface IUserInfo {
	/**
	 * 插入一条userinfo的记录
	 * @param userid
	 * @param usersex
	 * @param userphone
	 * @param state
	 */
	public void  insertInfo(@Param("userid")int userid,@Param("usersex")String usersex,@Param("userphone")String userphone,@Param("userstate")int state);
	
}