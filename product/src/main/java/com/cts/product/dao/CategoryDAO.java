package com.cts.product.dao;

import java.util.List;

import com.cts.product.bean.Category;





public interface CategoryDAO {
	public List<Category> getCategoryName();
	public List<Category> getAllCategory();
	public String insertCategory(Category category);
}
