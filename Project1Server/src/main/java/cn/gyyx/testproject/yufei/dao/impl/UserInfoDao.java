/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日下午3:26:06
 * 版本号：v1.0
 * 本类主要用途叙述：userInfo的Dao层实现类
 */



package cn.gyyx.testproject.yufei.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.struts.action.SessionActionMapping;

import cn.gyyx.testproject.yufei.dao.IUserInfo;
import cn.gyyx.testproject.yufei.dao.IUserKey;
import cn.gyyx.testproject.yufei.dao.MyBatiysConnectionFactory;

public class UserInfoDao implements IUserInfo
{
	private SqlSessionFactory sqlSessionFactory;

	/**
	 * 建立数据库连接工厂
	 */
	public UserInfoDao() {
		sqlSessionFactory = MyBatiysConnectionFactory.getSqlSessionFactory();

	}

	public void insertInfo(int userid, String usersex, String userphone,
			int state) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			IUserInfo userdao = sqlSession.getMapper(IUserInfo.class);
			userdao.insertInfo(userid, usersex, userphone, state);
			
	sqlSession.commit();

		} finally {
			sqlSession.close();
		}
		
		
	}


}
