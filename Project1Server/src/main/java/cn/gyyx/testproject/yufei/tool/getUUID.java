/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午8:27:11
 * 版本号：v1.0
 * 本类主要用途叙述：UUid的生成
 */



package cn.gyyx.testproject.yufei.tool;

import java.util.UUID;

/**
 * uuid生成
 * @author Administrator
 *
 */
public class getUUID {
	public String getUUID()
	{
		  String uuid = UUID.randomUUID().toString();
		  
		  return uuid;
	}

}
