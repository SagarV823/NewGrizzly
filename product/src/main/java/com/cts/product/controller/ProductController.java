package com.cts.product.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Category;
import com.cts.product.bean.Product;
import com.cts.product.service.CategoryService;
import com.cts.product.service.ProductService;



@Controller
public class ProductController {
	
	
	@Autowired
	//@Qualifier("productService")
	ProductService productService;
	
	
	@Autowired
	CategoryService categoryService;
	
	@RequestMapping("Admin-AddProduct.html")
	public String getAdminAddProduct(){
		return "Admin-AddProduct";
	}
	/*
	@RequestMapping("Admin-ListProducts.html")
	public String getAddProduct(){
		return "Admin-ListProducts";
	}*/
	

	
	@RequestMapping("Admin-AddProduct12.html")
	public ModelAndView displayCategory(@ModelAttribute Product product){
		
		ModelAndView modelAndView = new ModelAndView();
		List<Category> category = categoryService.getCategoryName();
		System.out.println(category);
		modelAndView.addObject("category", category);
		modelAndView.setViewName("Admin-AddProduct");
		return modelAndView;
		
	}
	
	@RequestMapping(value="Admin-AddProduct.html",method = RequestMethod.POST)
	public String addProduct(@ModelAttribute Product product,HttpSession httpSession){
		//session
		
		ModelAndView modelAndView = new ModelAndView();
		
		
		if("true".equals(productService.insertProduct(product)))
		{
			System.out.println(product);
			
			return "redirect:/Admin-ListProducts.html";
		}
		else
		{
			return null;
		}
		
	}
	
	@RequestMapping(value="Admin-ViewProduct.html")
	public ModelAndView getViewProduct(@RequestParam("id") String id,HttpSession httpSession){
		ModelAndView mav = new ModelAndView();
		Product product= productService.getProductById(id);
		mav.addObject("product",product);
		mav.setViewName("Admin-ViewProduct");
		return mav;
	}
	
	@RequestMapping(value="AdminDeleteProduct.html")
	public ModelAndView getDeleteProduct(@RequestParam("id") String id,HttpSession httpSession){
		ModelAndView mav = new ModelAndView();
		String st = productService.deleteProduct(id);
		if("true".equals(st))
		{
			mav.setViewName("AdminDeleteProduct");
				
		}
		return mav;
	}
	
	@RequestMapping(value="sortingHighToLow")
	public ModelAndView getDescendingProduct(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Product> products = productService.getDescProduct();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("Admin-ListProducts");
		return modelAndView;
	}
	
	@RequestMapping(value="sortingLowToHigh")
	public ModelAndView getAscendingProduct(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Product> products = productService.getAscProduct();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("Admin-ListProducts");
		return modelAndView;
	}
	
	@GetMapping(value="Logout.html")
	public ModelAndView exitProduct(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		httpSession.invalidate();
		
		modelAndView.setViewName("Logout");
		return modelAndView;
	}
	
	@RequestMapping(value="Admin-ListProducts.html")
	public ModelAndView getListProduct(HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		
		List<Product> products = productService.getAllProduct();
		
		modelAndView.addObject("products", products);
		modelAndView.setViewName("Admin-ListProducts");
		return modelAndView;
	}
	
	
	
	
	


}
