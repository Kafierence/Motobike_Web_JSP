package com.MotorbikeStore.service.impl;

import com.MotorbikeStore.dao.impl.regisDAO;
import com.MotorbikeStore.model.userModel;
import com.MotorbikeStore.service.IRegisService;

public class regisService implements IRegisService
{

	@Override
	public int regisUser(String pass, String uname, int cccd, int phone, String email) {
		// TODO Auto-generated method stub
	    userModel umodel = new userModel();
	    umodel.setUserPass(pass);
	    umodel.setUserName(uname);
	    umodel.setNumPhone(phone);
	    umodel.setEmail(email);
	    umodel.setCCCD(cccd);
		regisDAO userDAO = new regisDAO(); 
		if (userDAO.create(umodel) > 0)
		{
			return 1;
		} 
		return 0;
	}
	
}
