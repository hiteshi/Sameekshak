package com.cdac.sameekshak.web.login;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StudentLogoutServlet extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	
	public void init(ServletConfig conf) throws ServletException{
		
//		initializing the current servlet
		super.init(conf);
		
		}//------- init ------
	
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
//		calling the dopost() with current request and response objects so as to make only one function working
		
		doPost(req, res);
		
		
	}//----- doGet --------
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
		
		System.out.println(" logout servlet invoked ");
	
		HttpSession session = req.getSession(true);
		session.invalidate();
		res.sendRedirect("/sameekshak/");
		
	}

}
