package com.MotorbikeStore.controller.web;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MotorbikeStore.model.PictureModel;
import com.MotorbikeStore.model.ProductDetailModel;
import com.MotorbikeStore.service.IPictureService;
import com.MotorbikeStore.service.IProductDetailService;

@WebServlet("/shop")
public class shopController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    private IProductDetailService productDetailService;
    @Inject IPictureService PictureService;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ProductDetailModel model = new ProductDetailModel();
		List<ProductDetailModel> list = productDetailService.findNumberOfMotor(8);
		PictureModel model2 = new PictureModel();
		model2.setPicPath(request.getContextPath()+"/uploads/images/product/");
		for(ProductDetailModel o: list) {
			model2=  PictureService.findOneByAmotorId(o.getaMotorId());
			o.setPicName(model2.getPicName());
		}
		model.setListResult(list);
		
		request.setAttribute("model", model);
		RequestDispatcher rd = request.getRequestDispatcher("views/web/shop.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
