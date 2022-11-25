package com.MotorbikeStore.controller.web;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.MotorbikeStore.service.IRegisService;

@WebServlet("/regist")
public class registController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Inject
	private IRegisService regisService;
	
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("views/Login/regist.jsp");
		rd.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
		String uname = request.getParameter("name");
		String email = request.getParameter("email");
		String upass = request.getParameter("pass");
		int phone = Integer.parseInt(request.getParameter("contact"));
		int cccd = Integer.parseInt(request.getParameter("cccd"));
		try
		{			
			int rowCount = regisService.regisUser(upass,uname,cccd,phone,email);
			RequestDispatcher dispatcher = request.getRequestDispatcher("views/Login/regist.jsp");
			//neu them dl thanh cong 
			if (rowCount > 0)
			{
				request.setAttribute("status", "success");
			}
			else
			{
				request.setAttribute("status", "failed");

			}
			dispatcher.forward(request, response);
		} catch (Exception ex)
		{
			ex.printStackTrace();
		}
		
	}

}
