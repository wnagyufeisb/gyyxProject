/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午8:01:50
 * 版本号：v1.0
 * 本类主要用途叙述：Xmemcache
 */



package cn.gyyx.testproject.yufei.tool;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

import javax.servlet.jsp.tagext.TryCatchFinally;

import org.apache.oro.util.Cache;

import net.rubyeye.xmemcached.MemcachedClient;
import net.rubyeye.xmemcached.MemcachedClientBuilder;
import net.rubyeye.xmemcached.XMemcachedClientBuilder;
import net.rubyeye.xmemcached.exception.MemcachedException;
import net.rubyeye.xmemcached.utils.AddrUtil;

public class XMemcache  {
	/**
	 * 设定Xmencache值
	 * @param id
	 * @param value
	 * @throws IOException
	 */
	 public void setXMemcache(String id,String value) throws IOException {  
	MemcachedClientBuilder builder = new XMemcachedClientBuilder( AddrUtil.getAddresses("localhost:11211"));
	MemcachedClient memcachedClient = builder.build();
	
	try {
		memcachedClient.set(id, 0, value);
	} catch (TimeoutException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (MemcachedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}  
	 }
	 /**
	  * 获得cache内的值
	  * @param id
	  * @throws IOException
	  */
	 public String getXMemcache(String id) throws IOException{
		 MemcachedClientBuilder builder = new XMemcachedClientBuilder( AddrUtil.getAddresses("localhost:11211"));
			MemcachedClient memcachedClient = builder.build();
			String hehe = "";
			try {
				 hehe=memcachedClient.get(id);
			} catch (TimeoutException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (MemcachedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			return hehe;
		 
	 }
	 
	 
	 
	 
	 
}