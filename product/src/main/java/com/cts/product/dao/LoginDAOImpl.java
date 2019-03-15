package com.cts.product.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Login;


@Repository("loginDAO")
public class LoginDAOImpl implements LoginDAO{
	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;

	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Transactional(readOnly = true)
	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
				
		Session session = null;
		
				String query= "from Login where userName = ? AND password = ?";
			Query<Login> query2=null;
				try {
					session = sessionFactory.getCurrentSession();
					query2=session.createQuery(query);
					query2.setParameter(0, userName);
					query2.setParameter(1, password);
					Login login = query2.getSingleResult();
					System.out.println(login.getUserAddress());
					if(login==null)
						return null;
					else
						return login;
				} catch (Exception e) {
					e.printStackTrace();
				}
		return null;
	}

	@Override
	public Login getUserById(String userName) {
		// TODO Auto-generated method stub
		Session session = null;
		
		String query= "from Login where userName = ? ";
	Query<Login> query2=null;
		try {
			session = sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, userName);
			Login login = query2.getSingleResult();
			if(login==null)
				return null;
			else
				return login;
		} catch (Exception e) {
			e.printStackTrace();
		}
return null;
	}

}
