package com.cts.product.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;

import javax.persistence.criteria.*;
import org.hibernate.*;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Category;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


import com.cts.product.bean.Login;
import com.cts.product.bean.Product;



@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO{

	
	@Autowired
	@Qualifier("sessionFactory")
	SessionFactory sessionFactory;
	
	
	//Transaction transaction;
	@Transactional
	public String insertProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
		session = sessionFactory.getCurrentSession();
		//transaction = session.getTransaction();
		//transaction.begin();
		
		session.save(product);
			return "true";
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		
		return null;
	}

	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		Session session = null;
		try {
		session = sessionFactory.getCurrentSession();
		//transaction = session.getTransaction();
		//transaction.begin();
		
		session.update(product);
			return "true";
		}
		catch(Exception e)
		{
		      e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public Product getProductById(String productId) {
		// TODO Auto-generated method stub
		Session session = null;
		
		String query= "from Product where productId = ?";
	Query<Product> query2=null;
		try {
			session = sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, productId);
			Product product = query2.getSingleResult();
			if(product==null)
				return null;
			else
				return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Transactional
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		
		
		Session session = null;
		
	      try {
	    	  String query= "from Product";
	    		Query<Product> query2=null;
	    			
	    				session = sessionFactory.getCurrentSession();
	    				query2=session.createQuery(query);
	    				
	    				List<Product> products = query2.getResultList();
	    				if(products==null)
	    					return null;
	    				else
	    					return products;
	    			} catch (Exception e) {
	    				e.printStackTrace();
	    			}
	      
	    			return null;
	}

	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		Session session = null;
		
		String query= "from Product where productName = ?";
	Query<Product> query2=null;
		try {
			session = sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, name);
			Product product = query2.getSingleResult();
			if(product==null)
				return null;
			else
				return product;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Transactional
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		
		Session session = null;
		String query= "from Product where productId = ?";
		Query<Product> query2=null;
		try {
			session = sessionFactory.getCurrentSession();
			query2=session.createQuery(query);
			query2.setParameter(0, id);
			Product product = query2.getSingleResult();
			session.delete(product);
				return "true";
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Transactional
	public List<Product> getDescProduct() {
		Session session = null;
		
	      try {
	    	  String query= "from Product order by productName DESC";
	    		Query<Product> query2=null;
	    			
	    				session = sessionFactory.getCurrentSession();
	    				query2=session.createQuery(query);
	    				
	    				List<Product> products = query2.getResultList();
	    				if(products==null)
	    					return null;
	    				else
	    					return products;
	    			} catch (Exception e) {
	    				e.printStackTrace();
	    			}
	      
	    			return null;
	}

	@Transactional
	public List<Product> getAscProduct() {
		// TODO Auto-generated method stub
		Session session = null;
		
	      try {
	    	  String query= "from Product order by productName";
	    		Query<Product> query2=null;
	    			
	    				session = sessionFactory.getCurrentSession();
	    				query2=session.createQuery(query);
	    				
	    				List<Product> products = query2.getResultList();
	    				if(products==null)
	    					return null;
	    				else
	    					return products;
	    			} catch (Exception e) {
	    				e.printStackTrace();
	    			}
		return null;
	}

}
