package com.sathya.Management;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//get the request data
		String userId = request.getParameter("userId");
		String emailId = request.getParameter("emailId");
		
		//call the dao by passing servlet data
		UserDao dao = new UserDao();
		boolean check = dao.login(userId,emailId);
		System.out.println(check);
		
		//to give data to jsp put in request object
		request.setAttribute("login",check);
		
		//forward the request to jsp file
		RequestDispatcher dispatcher = request.getRequestDispatcher("logindisplay.jsp");
		dispatcher.forward(request, response);
	
	}

}
