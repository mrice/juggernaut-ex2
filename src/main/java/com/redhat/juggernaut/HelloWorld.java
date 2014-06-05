package com.redhat.juggernaut;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/hello")
public class HelloWorld extends HttpServlet {

	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hello = request.getParameter("name")!=null ? sayHello(request.getParameter("name")) : sayHello("visitor");
		response.getWriter().println(hello);
	}
	
	String sayHello(String name) {
		return String.format("hey there %s", name); 
	}

}
