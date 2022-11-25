package com.MotorbikeStore.dao.impl;

import com.MotorbikeStore.model.userModel;

public class regisDAO extends AbstractDAO<userModel>
{
	public int create(userModel newUser) {
		String sql ="insert into USER(user_pass,user_name,cccd,num_phone,email) values(?,?,?,?,?)";

		return insert(sql,newUser.getUserPass(), newUser.getUserName(), newUser.getCCCD(), newUser.getNumPhone(), newUser.getEmail());
	}

}
