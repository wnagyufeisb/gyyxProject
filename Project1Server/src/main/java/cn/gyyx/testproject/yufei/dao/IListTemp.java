/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月28日下午2:41:10
 * 版本号：v1.0
 * 本类主要用途叙述：列表接口
 */



package cn.gyyx.testproject.yufei.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.gyyx.testproject.yufei.bean.ListTemp;

public interface IListTemp {
	/**
	  * 按数量查询记录
	  * @param n1
	  * @param size
	  * @return List<ListTemp>
	  */
	 public List<ListTemp> selectTemp(@Param("n1")int n1,@Param("size")int size);

}
