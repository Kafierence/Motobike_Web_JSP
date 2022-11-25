package com.MotorbikeStore.service;

import com.MotorbikeStore.model.userModel;

public interface IRegisService {
	public int regisUser(String pass, String uname, int cccd, int phone, String email);
	
}
