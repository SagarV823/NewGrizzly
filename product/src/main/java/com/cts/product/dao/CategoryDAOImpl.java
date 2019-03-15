package com.cts.product.dao;

import java.util.List;
import javax.persistence.criteria.*;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Category;
import com.cts.product.bean.Product;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;






@Repository("categoryDAO")

public class CategoryDAOImpl implements CategoryDAO {

	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;

	@Transactional(readOnly=true)
	public List<Category> getCategoryName() {
		// TODO Auto-generated method stub\
		System.out.println("1111111111111");
		Session session = null;
		
	      try {
	    	  String query= "from Category";
	    		Query<Category> query2=null;
	    			System.out.println("2222222222222222");
	    				session = sessionFactory.getCurrentSession();
	    				query2=session.createQuery(query);
	    				
	    				List<Category> category = query2.getResultList();
	    				if(category==null)
	    					return null;
	    				else
	    					return category;
	    			} catch (Exception e) {
	    				e.printStackTrace();
	    			}
	      
	    			return null;

	}
	
	
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		/*Transaction transaction = null;
	      try (Session session = HibernateUtil.getSessionFactory().openSession()) {
	         transaction = session.beginTransaction();

	         CriteriaBuilder builder = session.getCriteriaBuilder();
	         CriteriaQuery<Category> query = builder.createQuery(Category.class);
	         Root<Category> root = query.from(Category.class);
	         query.select(root);
	         Query<Category> q=session.createQuery(query);
	         List<Category> employees=q.getResultList();
	         for (Category employee : employees) {
	            //System.out.println(employee.getName());
	        	 System.out.println(employee.toString());
	         }
	         transaction.commit();
	      } catch (Exception e) {
	         e.printStackTrace();
	         if (transaction != null) {
	            transaction.rollback();
	         }
	      }
*/
			return null;
			
	}
	
	/*public String insertCategory1(Category category) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction transaction = null;
		try {
		session = sessionFactory.openSession();
		transaction = session.getTransaction();
		transaction.begin();
		session.save(category);
		transaction.commit();
		}
		catch(Exception e)
		{
			if (transaction != null) {
		        transaction.rollback();
		      }
		      e.printStackTrace();
		}
		finally {
			if (session != null) {
		        session.close();
		      }
		}
		return "null of insertCategory";
	}*/

	public String insertCategory(Category category) {
		// TODO Auto-generated method stub
		return null;
	}

}
