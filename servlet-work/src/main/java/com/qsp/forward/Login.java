package com.qsp.forward;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Login extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user = req.getParameter("un");
		String pass = req.getParameter("pass");
		if(user.equals("xyz") && pass.equals("123"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("/home");
			rd.forward(req, resp);
		}
		else {
			RequestDispatcher rd = req.getRequestDispatcher("/login.html");
			rd.include(req, resp);
			
		}
		
		
//		PrintWriter pw = resp.getWriter();
//		pw.print("<h1 >Login fail</h1>");
	}
	
}
