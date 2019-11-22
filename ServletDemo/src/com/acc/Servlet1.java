package com.acc;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet1() {
		super();
		System.out.println("Servlet Constructor created");
	}

	public void init(ServletConfig config) throws ServletException {
		System.out.println("Init method");
	}

	public void destroy() {
		System.out.println("Destroy method");
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// doing the actual task
		System.out.println("Service method");
	}

}
