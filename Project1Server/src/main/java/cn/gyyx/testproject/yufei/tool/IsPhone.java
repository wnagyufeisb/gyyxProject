/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午2:19:35
 * 版本号：v1.0
 * 本类主要用途叙述：电话格式的判断
 */



package cn.gyyx.testproject.yufei.tool;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IsPhone {

	/**
	 * 判断电话的格式
	 * 
	 * @param Phone
	 * @return boolean
	 */
	public boolean IsPhone(String Phone) {
		Pattern p1 = Pattern
				.compile("^(0[0-9]{2,3}/-)?([2-9][0-9]{6,7})+(/-[0-9]{1,4})?$");
		Matcher m1 = p1.matcher(Phone);
		Pattern p2 = Pattern
				.compile("^((13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$");
		Matcher m2 = p2.matcher(Phone);
		if (m1.matches() == true || m2.matches() == true) {
			return true;
		} else {
			return false;
		}

	}

}
