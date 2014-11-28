/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月28日下午2:42:23
 * 版本号：v1.0
 * 本类主要用途叙述：处理用户相关请求，包括登陆和注册
 */



package cn.gyyx.testproject.yufei.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.testproject.yufei.bean.ListTemp;
import cn.gyyx.testproject.yufei.dao.IListTemp;
import cn.gyyx.testproject.yufei.dao.IUserKey;
import cn.gyyx.testproject.yufei.dao.MyBatiysConnectionFactory;

public class UserListDao implements IListTemp{

	private SqlSessionFactory sqlSessionFactory;

	/**
	 * 建立数据库连接工厂
	 */
	public UserListDao() {
		sqlSessionFactory = MyBatiysConnectionFactory.getSqlSessionFactory();

	}

	/**
	 * 查询当前页的记录
	 */
	public List<ListTemp> selectTemp(int n1, int size) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		IListTemp userdao = sqlSession.getMapper(IListTemp.class);
		return userdao.selectTemp(n1, size);
		
	}

}
