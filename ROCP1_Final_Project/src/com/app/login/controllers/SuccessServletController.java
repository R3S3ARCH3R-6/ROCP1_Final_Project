package com.app.login.controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SuccessServletController
 */
@WebServlet(description = "this is a servlet that loads a page after a successful login to the system", urlPatterns = { "/SuccessServletController" })
public class SuccessServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SuccessServletController() {
        super();
    }

    /**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.print("<h2>Welcome, "+request.getParameter("userName")+"</h2>");
		out.print("<h3>You have logged in successfully at "+new Date()+"</h3>");
		out.print("<a href='/home_login'>Click Here to Logoff</a>");
	}

}
