package com.MotorbikeStore.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.MotorbikeStore.dao.IProductDetailDAO;
import com.MotorbikeStore.model.ProductDetailModel;
import com.MotorbikeStore.service.IProductDetailService;

public class ProductDetailService implements IProductDetailService {

	@Inject
	private IProductDetailDAO productDetailDAO;
	@Override
	public List<ProductDetailModel> findAll() {
		
		return productDetailDAO.findAll();
	}
	@Override
	public List<ProductDetailModel> findByMotorcyclesID(int moID) {
		if(moID == 0 ) {
			return productDetailDAO.findAll();
		}
		return productDetailDAO.findByMotorcyclesID(moID);
	}
	@Override
	public List<ProductDetailModel> findNumberOfMotor(int numberMotor) {
		
		return productDetailDAO.findNumberOfMotor(numberMotor);
	}
	@Override
	public ProductDetailModel findOneByAmotorId(int aMotorId) {
		
		return productDetailDAO.findOneByAmotorId(aMotorId);
	}

}
