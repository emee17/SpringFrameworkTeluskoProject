package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.entity.Feedback;

@Component("fdao")
//@Repository
//@Transactional
public class FeedbackDao 
{
	@Autowired
	@Qualifier("sessionFactory")
	private SessionFactory sessionFactory;

	/*public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/

	@Transactional
	public void addFeedback(Feedback feedback)
	{
		System.out.println("in addFeedback" + feedback);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(feedback);
	}
}
