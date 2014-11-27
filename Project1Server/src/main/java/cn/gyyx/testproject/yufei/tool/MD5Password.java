/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午1:32:57
 * 版本号：v1.0
 * 本类主要用途叙述：对密码加密
 */



package cn.gyyx.testproject.yufei.tool;

import java.security.MessageDigest;

public class MD5Password {
	/**
	 * 对字符串加密
	 * @param s
	 * @return String
	 */
	public String MD5(String s) {  
     return cn.gyyx.core.utility.MD5.encode(s);
     
    }  

}
