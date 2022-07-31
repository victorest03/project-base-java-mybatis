package com.myproject.commons;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.myproject.database.MySQLConnection;

public class ServiceBase implements AutoCloseable {
	protected SqlSessionFactory sessionFactory;
	protected SqlSession session;
	
	public ServiceBase() {
		MySQLConnection connection = new MySQLConnection();
		sessionFactory = connection.Init();
		session = sessionFactory.openSession();
	}
	
	public void Commit() {
		if(session != null) session.commit();
	}
	
	public void Rollback() {
		if(session != null) session.rollback();
	}

	@Override
	public void close() throws Exception {
		if(session != null) session.close();
	}
}
