package com.sathya.Management;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the request data
		String userId = request.getParameter("userId");
		
		// call the dao by passing servlet data
		UserDao dao = new UserDao();
		User user = dao.findById(userId);
		
		//set the data into Request object to use in jsp
		request.setAttribute("user", user);
		
		//forward the request to jsp file
		RequestDispatcher dispatcher = request.getRequestDispatcher("searchdisplay.jsp");
		dispatcher.forward(request, response);
	}
	

}
