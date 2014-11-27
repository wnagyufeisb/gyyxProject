/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午2:50:39
 * 版本号：v1.0
 * 本类主要用途叙述：这玩意生成随机的一个五位字符串
 */



package cn.gyyx.testproject.yufei.tool;

import java.util.Random;

public class Stringrandom {
	public String Stringrandom()
	{
		//没有必要构造一个String对象，应直接用char[]。既然是static方法每次调用此方法均会用到此字符集，何不设为类的静态私有成员。
        String charList = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
//应使用char[length]代替rev
        String rev = "";
        java.util.Random f = new Random();
        for(int i=0;i<5;i++)
        {
//由于rev设为String型致每次循环生成一个String对象，没有必要。另用%进行随机计算时间效率低。
           rev += charList.charAt(Math.abs(f.nextInt())%charList.length());
        }
        return rev;
	}

}
