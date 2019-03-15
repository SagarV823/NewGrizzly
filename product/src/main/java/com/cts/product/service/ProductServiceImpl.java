package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Product;
import com.cts.product.dao.ProductDAO;
import com.cts.product.dao.ProductDAOImpl;

@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductDAO productDAO;
	
	//ProductDAO dao = new ProductDAOImpl();

	public String insertProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.insertProduct(product);
	}

	public String updateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDAO.updateProduct(product);
	}

	public Product getProductById(String id) {
		// TODO Auto-generated method stub
		return productDAO.getProductById(id);
	}

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productDAO.getAllProduct();
	}

	public Product getProductByName(String name) {
		// TODO Auto-generated method stub
		return productDAO.getProductByName(name);
	}

	@Override
	public String deleteProduct(String id) {
		// TODO Auto-generated method stub
		return productDAO.deleteProduct(id);
	}

	@Override
	public List<Product> getDescProduct() {
		// TODO Auto-generated method stub
		return productDAO.getDescProduct();
	}

	@Override
	public List<Product> getAscProduct() {
		// TODO Auto-generated method stub
		return productDAO.getAscProduct();
	}

}
