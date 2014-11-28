/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月28日上午9:20:20
 * 版本号：v1.0
 * 本类主要用途叙述：插入日志的service实现层
 */



package cn.gyyx.testproject.yufei.service.impl;

import javax.servlet.http.HttpServletRequest;

import cn.gyyx.testproject.yufei.dao.IUserLog;
import cn.gyyx.testproject.yufei.dao.impl.UserLogDao;
import cn.gyyx.testproject.yufei.service.IUserLogs;

public class UserLogs implements IUserLogs {
/**
 * 产生用户日志
 * @param userName
 * @param userIP
 */
	public void setUserLog(String userName, String userIP) {
		IUserLog userLog=new UserLogDao();
		userLog.insertLog(userName, userIP);
		
	}

public String getIP(HttpServletRequest request) {
	
		                 
		
		            String ip = request.getHeader("x-forwarded-for"); 
		
		            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		
		                ip = request.getHeader("Proxy-Client-IP"); 
		
		            } 
		
		            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		
		                ip = request.getHeader("WL-Proxy-Client-IP"); 
		
		            } 
		
		            if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) { 
		
		                ip = request.getRemoteAddr(); 
		
		            } 
		
		       
		
		            return ip;
		
		        

}
	

}
