package com.cts.product.service;

import java.util.List;

import com.cts.product.bean.Category;





public interface CategoryService {
	public List<Category> getCategoryName();
	public List<Category> getAllCategory();
	public String insertCategory(Category category);
}
