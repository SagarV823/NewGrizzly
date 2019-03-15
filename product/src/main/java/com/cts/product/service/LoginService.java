package com.cts.product.service;


import com.cts.product.bean.Login;

public interface LoginService {
	public int getUserStatus(String id); 
	public String getUserType(String id);
	public Login authenticate(String userName, String password);
}
