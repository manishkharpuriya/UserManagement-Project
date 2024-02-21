package com.sathya.Management;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the request data
		String userId = request.getParameter("userId");
		
		//call the Dao layer by passing servlet data
		UserDao dao = new UserDao();
		int result = dao.deleteById(userId);
		
		//to give data to jsp put in request object
		request.setAttribute("deleteResult", result);
		
		//forward the request to jsp file
		RequestDispatcher dispatcher = request.getRequestDispatcher("delete.jsp");
		dispatcher.forward(request, response);
	}

}
