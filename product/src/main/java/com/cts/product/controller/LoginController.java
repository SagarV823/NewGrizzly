package com.cts.product.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.bean.Login;
import com.cts.product.bean.Product;
import com.cts.product.service.LoginService;
import com.cts.product.service.ProductService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;
	// using existing one created by @service
	
	
	@Autowired
	//@Qualifier("productService")
	ProductService productService;
	
	@RequestMapping("login.html")
	public String getLoginPage(){
		return "login";
	}
	
	// hyperlinks get
	// submission post
	
	

	
	
	@PostMapping("login.html")
	public ModelAndView validateUser(@ModelAttribute Login login, HttpSession httpSession){
		ModelAndView modelAndView = new ModelAndView();
		Login login2 = loginService.authenticate(login.getUserName(), login.getPassword());
		if(loginService.authenticate(login.getUserName(),login.getPassword()) != null)
		{
			if("admin".equals(login.getUserName()) && "admin".equals(login.getPassword()))
			{
				modelAndView.addObject("user", login2);
				httpSession.setAttribute("user", login2);
				System.out.println(login.getUserAddress());
				modelAndView.setViewName("Admin-ListProducts");
				List<Product> products = productService.getAllProduct();
				System.out.println("hiiiiiiii"+products);
				modelAndView.addObject("products", products);
				//modelAndView.setViewName("admin");
			}
			
		}
		else 
		{
			modelAndView.setViewName("login");
		}
		return modelAndView;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	@Autowired
	private LoginService loginService;

	@RequestMapping("login.html")
	public String getLoginPage(){
		return "login";
	}
	
	
	@RequestMapping(value ="login.html",method=RequestMethod.POST)
	public ModelAndView validateUser(@ModelAttribute Login login){
		ModelAndView modelAndView = new ModelAndView();
		//LoginService loginService = new LoginServiceImpl();
		//login= loginService.authenticate(userName, password);
		if("admin".equals(login.getUserName())&&"admin".equals(login.getPassword())){
			modelAndView.setViewName("admin");
		}
		else {
			modelAndView.setViewName("login");
		}
		return modelAndView;
		
	}
	*/
	
	
	
	
}
