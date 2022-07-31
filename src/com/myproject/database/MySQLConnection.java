package com.myproject.database;
import java.io.IOException;
import java.io.InputStream;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySQLConnection {
	private static SqlSessionFactory sqlSessionFactory = null;
	private static String resource = "com/myproject/database/xml/sql_configuration.xml";
	
	public SqlSessionFactory Init(){
		try{
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		}catch (IOException e){
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}
}
