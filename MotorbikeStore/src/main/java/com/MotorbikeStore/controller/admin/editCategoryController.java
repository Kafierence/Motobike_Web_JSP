package com.MotorbikeStore.controller.admin;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MotorbikeStore.model.motorcyclesModel;
import com.MotorbikeStore.model.specificationModel;
import com.MotorbikeStore.service.IMotorcyclesService;
import com.MotorbikeStore.service.ISpecificationService;

@WebServlet("/admin-editcategory")
public class editCategoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Inject
	private IMotorcyclesService motorcyclesService;
	@Inject
	private ISpecificationService specificationService;
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		
		motorcyclesModel model1 = new motorcyclesModel();
		model1=motorcyclesService.findOneById(id);
		request.setAttribute("model1", model1);
		
		
		
		specificationModel model2 = new specificationModel();
		model2= specificationService.findOne(id);
		request.setAttribute("model2", model2);
		RequestDispatcher rd = request.getRequestDispatcher("views/admin/editCategory.jsp");

		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
