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


@WebServlet("/notaddshopDetail")
public class shopDetailController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    @Inject
    private IProductDetailService ProductDetailService;
    @Inject
    private IPictureService PictureService;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int aMotorId = Integer.parseInt(request.getParameter("id"));
		ProductDetailModel model = new ProductDetailModel();
		model = ProductDetailService.findOneByAmotorId(aMotorId);
		request.setAttribute("model", model);
		PictureModel model2 = new PictureModel();
		PictureModel model3 = new PictureModel();
		
		List<PictureModel> list = PictureService.findByAMotorId(aMotorId);
		
		
		for(PictureModel o: list) {
			model3.setPicName(o.getPicName());
			list.remove(0);
			break;
		}
		model2.setListResult(list);
		request.setAttribute("model3", model3);
		request.setAttribute("model2", model2);
		
		
		RequestDispatcher rd = request.getRequestDispatcher("views/web/shopDetail.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
