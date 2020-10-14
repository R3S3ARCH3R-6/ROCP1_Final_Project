package com.app.controllers;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.exception.BusinessException;
import com.app.models.User;
import com.app.service.LoginService;
import com.app.service.implement.LoginServiceImpl;


/**
 * Servlet implementation class BankLoginController
 */
@WebServlet(description = "This servlet controls what type of user signs into the app and if a user can sign in", urlPatterns = { "/BankLoginController" })
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 * 
	 * this is the same code as LoginController from the web-login app
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//show response/result of everything in an html or text file
		response.setContentType("text/html");
		
		//create a user that accepts user input and checks the database with it
		User user=new User();
		user.setUserName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		
		//use LoginServiceImpl class to see if the username and password are valid inputs  
		LoginService service=new LoginServiceImpl();
		RequestDispatcher requestDispatcher=null;	//make an object that can receive input from a server
		PrintWriter out=response.getWriter();	//send out a response to the server
		try {
			if(service.isValidUserCredentials(user)) {
				//success
				requestDispatcher=request.getRequestDispatcher("success");
				requestDispatcher.forward(request, response);
				//(above) send you to the next page
			}
		} catch (BusinessException e) {
			//failure
			requestDispatcher=request.getRequestDispatcher("home_login.html");
			requestDispatcher.include(request, response);
			out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
		}
	}

}
