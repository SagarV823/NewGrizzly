package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Category;
import com.cts.product.dao.CategoryDAO;
import com.cts.product.dao.CategoryDAOImpl;
import com.cts.product.dao.ProductDAO;



@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class CategoryServiceImpl implements CategoryService{
		
	@Autowired
	private CategoryDAO categoryDAO;
	
		public List<Category> getCategoryName() {
			// TODO Auto-generated method stub
			return categoryDAO.getCategoryName();
		}

		
	
		public String insertCategory(Category category) {
			// TODO Auto-generated method stub
			return categoryDAO.insertCategory(category);
		}



		@Override
		public List<Category> getAllCategory() {
			// TODO Auto-generated method stub
			return categoryDAO.getAllCategory();
		}



		
	
		}

		

		

	

		
