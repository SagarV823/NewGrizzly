package com.cts.product.dao;

import java.util.List;

import com.cts.product.bean.Product;

public interface ProductDAO {

	public String insertProduct(Product product);
	public String deleteProduct(String id);
	public String updateProduct(Product product);
	public Product getProductById(String id);
	public List<Product> getAllProduct();
	public Product getProductByName(String name);
	public List<Product> getDescProduct();
	public List<Product> getAscProduct();
}
