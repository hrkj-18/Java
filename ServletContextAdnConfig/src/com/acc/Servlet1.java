package com.acc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet1() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Servlet 1 Task Started");
		
		RequestDispatcher rd = request.getRequestDispatcher("/Servlet2");
		rd.forward(request, response);
		//rd.include(request, response);
		
		printWriter.print("Servlet 1 Task Ended ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
