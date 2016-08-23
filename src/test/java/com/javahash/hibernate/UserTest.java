package com.javahash.hibernate;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import junit.framework.TestCase;

public class UserTest extends TestCase {

	@Test
	public void test1(){
		
		HibernateSessionManager hbSessionManager = new HibernateSessionManager(); 
		SessionFactory factorySession = hbSessionManager.getSessionFactory();
		Session session = factorySession.openSession(); 
		session.beginTransaction(); 
			User user = new User(); 
			 user.setUserId(3);
			user.setUsername("test" );
			user.setCreatedBy("test");
			user.setCreatedDate(new Date());
			session.save(user);
			session.getTransaction().commit();
		factorySession.close();
	}
}
