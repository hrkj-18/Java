package com.acc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Welcome() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// response.getWriter().append("Served at: ").append(request.getContextPath());

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		if (username != null && password != null) {
						          
	        HttpSession session=request.getSession();  
	        session.setAttribute("username",username); 
	        session.setAttribute("password",password);

			out.print("Welcome "+username);
	        out.print("<html><body><br><a href='Main'>Main Page</a></body></html>");        
	        out.close();  

		} else {
			out.write("<html><body><h1>Null</h1></body></html>");
			RequestDispatcher rd = request.getRequestDispatcher("/login");
			rd.include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
