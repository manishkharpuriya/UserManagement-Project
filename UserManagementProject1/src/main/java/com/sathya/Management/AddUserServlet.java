package com.sathya.Management;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get the request the data
		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String userEmail = request.getParameter("userEmail");
		long userMobile = Long.parseLong(request.getParameter("userMobile"));
		String userLocation = request.getParameter("userLocation");
		
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserMobile(userMobile);
		user.setUserLocation(userLocation);
		
		//calling the Dao method by passingservlet data
		UserDao userDao = new UserDao();
		int result = userDao.saveUser(user);
		
		//set the data into Request object to use in jsp
		request.setAttribute("result", result);
		
		//forward the request to jsp file
		RequestDispatcher dispatcher = request.getRequestDispatcher("addUser.jsp");
		dispatcher.forward(request, response);
	}

}
