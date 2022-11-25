package com.MotorbikeStore.dao;

import java.util.List;

import com.MotorbikeStore.model.ProductDetailModel;

public interface IProductDetailDAO extends GenericDAO<ProductDetailModel> {
	List<ProductDetailModel> findAll();
	List<ProductDetailModel> findByMotorcyclesID(int moID);
	List<ProductDetailModel> findNumberOfMotor(int numberMotor);
	ProductDetailModel findOneByAmotorId(int aMotorId);
}
