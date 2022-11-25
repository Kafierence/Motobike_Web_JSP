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

@WebServlet(urlPatterns = {"/web-main-page"})
public class HomeController extends HttpServlet {

	private static final long serialVersionUID = 1L;
    @Inject
    private IProductDetailService productDetailService;
    @Inject
    private IPictureService PictureService;
   
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
		request.setAttribute("model2", model2);
		
		//First in home
		ProductDetailModel model3 = new ProductDetailModel();
		List<ProductDetailModel> list2 = productDetailService.findNumberOfMotor(3);
		PictureModel model4 = new PictureModel();
		for(ProductDetailModel o: list2) {
			model4=  PictureService.findOneByAmotorId(o.getaMotorId());
			o.setPicName(model4.getPicName());
		}	
		
		ProductDetailModel model5 = new ProductDetailModel();
		for(ProductDetailModel o: list2) {
			model5.setPicName(o.getPicName());
			model5.setMotors_Name(o.getMotors_Name());
			model5.setMotorsDecs(o.getMotorsDecs());
			model5.setaMotorId(o.getaMotorId());
			list2.remove(0);
			break;
		}
		model3.setListResult(list2);
		request.setAttribute("model3", model3);
		request.setAttribute("model5", model5);
		
		RequestDispatcher rd = request.getRequestDispatcher("views/web/home.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
