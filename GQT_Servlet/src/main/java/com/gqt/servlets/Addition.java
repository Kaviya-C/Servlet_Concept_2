package com.gqt.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Addition  extends HttpServlet
{
	private HttpSession session;
	
	@Override
	public void service(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException, IOException
	{
		String para1=req.getParameter("num1");
		int num1=Integer.parseInt(para1);
		
		String para2 = req.getParameter("num2");
		int num2=Integer.parseInt(para2);
		
		int adding= num1+ num2;
		
		//Creating a new Session
		session =req.getSession(true);
		session.setAttribute("num1", num1);
		session.setAttribute("num2", num2);
		session.setAttribute("adding", adding);
		
		res.sendRedirect("/GQT_Servlet/multiplication");
		
	}

}
