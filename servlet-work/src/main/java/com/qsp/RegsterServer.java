package com.qsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegsterServer extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("un");
		String phone = req.getParameter("ph");
		PrintWriter pw = resp.getWriter();
		pw.print("<h1>User naame : " + name + "</h1>");
		pw.print("<h1>Phone Number : " + phone + "</h1>");
	}

}
