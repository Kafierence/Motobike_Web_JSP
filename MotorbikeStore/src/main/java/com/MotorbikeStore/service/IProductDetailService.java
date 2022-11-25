package com.MotorbikeStore.service;

import java.util.List;

import com.MotorbikeStore.model.ProductDetailModel;

public interface IProductDetailService {
	List<ProductDetailModel> findAll();
	List<ProductDetailModel> findByMotorcyclesID(int moID);
	List<ProductDetailModel> findNumberOfMotor(int numberMotor);
	ProductDetailModel findOneByAmotorId(int aMotorId);
}
