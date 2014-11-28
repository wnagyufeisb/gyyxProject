/**
 * --------------------------------------------------- 
 *  版权所有：北京光宇在线科技有限责任公司
 * 作者：王宇飞 
 * 联系方式：wangyufei@gyyx.cn 
 * 创建时间：2014年11月27日上午9:56:33
 * 版本号：v1.0
 * 本类主要用途叙述：	UserKey的数据库实现类
 */



package cn.gyyx.testproject.yufei.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import cn.gyyx.testproject.yufei.bean.ListTemp;
import cn.gyyx.testproject.yufei.bean.UserKey;
import cn.gyyx.testproject.yufei.dao.IUserKey;
import cn.gyyx.testproject.yufei.dao.MyBatiysConnectionFactory;

public class UserKeyDao implements IUserKey {
	private SqlSessionFactory sqlSessionFactory;

	/**
	 * 建立数据库连接工厂
	 */
	public UserKeyDao() {
		sqlSessionFactory = MyBatiysConnectionFactory.getSqlSessionFactory();

	}

	/**
	 * 通过用户账户查找用户主要信息
	 * 
	 * @param userName
	 * @return UserKey
	 */
	public UserKey selectUserByUserName(String username) {

		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {
			System.out.println("sdsddsds2" + username);

			IUserKey userdao = sqlSession.getMapper(IUserKey.class);
			System.out.println("sdsddsds2" + username);
			return userdao.selectUserByUserName(username);

		} finally {
			sqlSession.close();
		}
	}
/**
 * 判断是否存在该用户
 */
	public boolean IsUser(String username) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			IUserKey userdao = sqlSession.getMapper(IUserKey.class);
			UserKey userKey = userdao.selectUserByUserName(username);
			if (userKey != null) {
				return false;
			} else {
				return true;
			}

		} finally {
			sqlSession.close();
		}

	}
/**
 * 插入用户userKey记录
 */
	public void insertUserKey(String username,String password,String pstring) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		try {

			IUserKey userdao = sqlSession.getMapper(IUserKey.class);
			userdao.insertUserKey(username, password, pstring);
			sqlSession.commit();
			

		} finally {
			sqlSession.close();
		}
		
	}
/**
 * 查找用户记录的数量 
 */
	public int selectNumberUser() {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		IUserKey userdao = sqlSession.getMapper(IUserKey.class);
		int number=userdao.selectNumberUser();
		return number;
	}

}
