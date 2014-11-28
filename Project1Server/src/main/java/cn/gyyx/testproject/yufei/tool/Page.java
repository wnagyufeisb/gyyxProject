/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月28日上午11:46:50
 * 版本号：v1.0
 * 本类主要用途叙述：用于分页
 */



package cn.gyyx.testproject.yufei.tool;

import java.util.List;

import cn.gyyx.testproject.yufei.bean.ListTemp;
import cn.gyyx.testproject.yufei.dao.IListTemp;
import cn.gyyx.testproject.yufei.dao.IUserKey;
import cn.gyyx.testproject.yufei.dao.impl.UserKeyDao;
import cn.gyyx.testproject.yufei.dao.impl.UserListDao;

public class Page {
	private int PageSize=10;
	private int totalPage;
	private IUserKey iKey= new UserKeyDao();
	private IListTemp iListTemp=new UserListDao();
	/**
	 * 要获取总的页数
	 */
	public Page()
	{
		iKey= new UserKeyDao();
		int number=iKey.selectNumberUser();
		totalPage=number/ PageSize;
		if(number%PageSize!=0)
		{
			totalPage=totalPage+1;
		}
		
	}
	/**
	 * 得到当前页面的记录
	 * @param pageNo
	 * @return List<ListTemp>
	 */
	public List<ListTemp> getList(int pageNo)
	{
		if(pageNo<1)
		{
			pageNo=1;
		}
		if(pageNo>totalPage)
		{
			pageNo=totalPage;
		}
		
		int n1=pageNo*10-10;
		
		return iListTemp.selectTemp(n1, PageSize);
		
		
		
	}
}
