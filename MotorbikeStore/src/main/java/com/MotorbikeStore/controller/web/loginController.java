package com.MotorbikeStore.controller.web;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.MotorbikeStore.model.userModel;
import com.MotorbikeStore.service.ILoginService;

@WebServlet("/login")
public class loginController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Inject
	private ILoginService userService;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("views/Login/login.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String umail = request.getParameter("email");
		String upass = request.getParameter("pass");
		HttpSession session = request.getSession();
		//RequestDispatcher dispatcher = null;
		userModel model = new userModel();
//		model.setEmail(umail);
//		model.setUserPass(upass);
		 model  = userService.login(umail,upass); 
		 if(model != null)
		 {
			 if(model.getRoleId() == 1)
			 {
				 response.sendRedirect(request.getContextPath() + "/web-main-page");
				 session.setAttribute("name", model.getEmail());
			 }else if(model.getRoleId() == 2)
			 {
				 response.sendRedirect(request.getContextPath() + "/admin");
				 session.setAttribute("name", model.getEmail());
			 }
		}
		 else
		 {
			 response.sendRedirect(request.getContextPath() + "/login?action=login");
		 }
	}

}
