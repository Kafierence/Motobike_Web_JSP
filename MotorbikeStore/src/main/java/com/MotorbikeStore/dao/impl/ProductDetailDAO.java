package com.MotorbikeStore.dao.impl;

import java.util.List;

import com.MotorbikeStore.dao.IProductDetailDAO;
import com.MotorbikeStore.mapper.ProductDetailMapper;
import com.MotorbikeStore.model.ProductDetailModel;

public class ProductDetailDAO extends AbstractDAO<ProductDetailModel> implements IProductDetailDAO {

	@Override
	public List<ProductDetailModel> findAll() {
		String sql = "select a.motors_id, a_motor_id, motors_name, version, motor_type, branch, style,color, price,date_insert, check_sold,  motor_desc  from motorcycles as m, a_motorcycle as a where a.motors_id = m.motors_id;";

		return query(sql, new ProductDetailMapper());
	}

	@Override
	public List<ProductDetailModel> findByMotorcyclesID(int moID) {

		String sql = "select a.motors_id, a_motor_id, motors_name, version, motor_type, branch, style,color, price,date_insert, check_sold,  motor_desc  from motorcycles as m, a_motorcycle as a where a.motors_id = m.motors_id and m.motors_id = ?;";

		return query(sql, new ProductDetailMapper(), moID);
	}

	@Override
	public List<ProductDetailModel> findNumberOfMotor(int numberMotor) {
		String sql = "select a.motors_id, a_motor_id, motors_name, version, motor_type, branch, style,color, price,date_insert, check_sold , motor_desc from motorcycles as m, a_motorcycle as a where a.motors_id = m.motors_id LIMIT ?;";
				

		return query(sql, new ProductDetailMapper(), numberMotor);
	}

	@Override
	public ProductDetailModel findOneByAmotorId(int aMotorId) {
		String sql = "select a.motors_id, a_motor_id, motors_name, version, motor_type, branch, style,color, price,date_insert, check_sold,  motor_desc  from motorcycles as m, a_motorcycle as a where a.motors_id = m.motors_id and a.a_motor_id = ?;";
		
		List<ProductDetailModel> list = query(sql, new ProductDetailMapper(), aMotorId);
		return list.isEmpty() ? null : list.get(0);
	}

}
