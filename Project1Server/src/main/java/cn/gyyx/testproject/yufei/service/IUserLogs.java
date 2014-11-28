/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月28日上午9:17:41
 * 版本号：v1.0
 * 本类主要用途叙述：用户日志写入的服务层接口
 */



package cn.gyyx.testproject.yufei.service;

import javax.servlet.http.HttpServletRequest;



public interface IUserLogs {
	/**
	 * 插入一条用户的日志信息
	 * @param userName
	 * @param userIP
	 */
	public void setUserLog(String userName,String userIP);
	/**
	 * 获取当前账户IP
	 * @return
	 */
	public String getIP(HttpServletRequest request);

}
