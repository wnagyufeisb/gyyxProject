package cn.gyyx.testproject.yufei.dao;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;



public class MyBatiysConnectionFactory {
	
private static SqlSessionFactory sqlSessionFactory ;
/**
 * 建立数据库连接的静态方法
 */
static {
	String resource="mybatis/config.xml";
	try {
		
		System.out.println(resource);
		Reader  reader =Resources.getResourceAsReader(resource);
		
		if(sqlSessionFactory==null)
		{
			
			sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader,"yufei1_db");
			System.out.println(resource);
		}
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}

/**
 * 得到链接工厂
 * @return sqlSessionFactory
 */
public static SqlSessionFactory getSqlSessionFactory() {
	return sqlSessionFactory;
}
/**
 * 设定链接工厂
 * @param sqlSessionFactory
 */

public static void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
	MyBatiysConnectionFactory.sqlSessionFactory = sqlSessionFactory;
}


















}
