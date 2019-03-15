package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.bean.Login;
import com.cts.product.dao.LoginDAO;


@Service
@Transactional(propagation = Propagation.SUPPORTS)
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	LoginDAO loginDAO;

	
	
	public int getUserStatus(String id) {
		// TODO Auto-generated method stub
		return loginDAO.getUserStatus(id);
	}

	public String getUserType(String id) {
		// TODO Auto-generated method stub
		return loginDAO.getUserType(id);
	}

	public Login authenticate(String userName, String password) {
		// TODO Auto-generated method stub
		return loginDAO.authenticate(userName, password);
	}

}
