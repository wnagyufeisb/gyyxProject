/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月26日下午7:09:28
 * 版本号：v1.0
 * 本类主要用途叙述：处理用户相关请求，包括登陆和注册
 */



package cn.gyyx.testproject.yufei.dao;

import org.apache.ibatis.annotations.Param;

import cn.gyyx.testproject.yufei.bean.UserLog;




public interface IUserLog {
	/**
	 * 插入登陆日志
	 * @param log
	 */
	public void insertLog(@Param("UserName")String userName,@Param("UserIP")String userIP);
	

}
