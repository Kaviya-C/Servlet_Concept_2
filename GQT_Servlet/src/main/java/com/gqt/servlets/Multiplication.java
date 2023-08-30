package com.gqt.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class Multiplication  extends HttpServlet
{
	private HttpSession session;
	public  void service(HttpServletRequest request,HttpServletResponse response)
	throws ServletException ,IOException
	{
		
		session =request.getSession();
		int num1 =(int) session.getAttribute("num1");
		int num2 = (int) session.getAttribute("num2");
		int adding =(int) session.getAttribute("adding");
		
		int multiply = num1 * num2;
		
		PrintWriter out= response.getWriter();
		out.println("Addition of "+num1+" and "+num2+ " is: "+adding);
		out.println("Multiplication of "+num1+ " and "+num2+" is: "+multiply);
		
		
	}

}
