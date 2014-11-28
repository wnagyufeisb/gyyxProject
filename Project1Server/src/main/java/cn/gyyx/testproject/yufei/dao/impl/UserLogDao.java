/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月28日上午9:01:37
 * 版本号：v1.0
 * 本类主要用途叙述：日志处理的dao曾
 */


package cn.gyyx.testproject.yufei.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.testproject.yufei.dao.IUserLog;
import cn.gyyx.testproject.yufei.dao.MyBatiysConnectionFactory;

public class UserLogDao implements IUserLog {
	private SqlSessionFactory sqlSessionFactory;

	public UserLogDao() {
		sqlSessionFactory = MyBatiysConnectionFactory.getSqlSessionFactory();

	}

	/**
	 * 插入一条用户日志的dao实现
	 */
	public void insertLog(String userName, String userIP) {
		// TODO Auto-generated method stub
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			IUserLog userdao = sqlSession.getMapper(IUserLog.class);
			userdao.insertLog(userName, userIP);
			sqlSession.commit();

		} finally {
			sqlSession.close();
		}

	}

}
