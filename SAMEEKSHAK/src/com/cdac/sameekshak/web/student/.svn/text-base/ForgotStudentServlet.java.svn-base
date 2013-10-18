package com.cdac.sameekshak.web.student;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.login.StudentManager;
import com.cdac.sameekshak.jndi.ContextUtils;

public class ForgotStudentServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println("inside ForgotStudentServlet");
		try {

			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();

			Object ref = ctx.lookup("LoginManager");
			StudentManager sUmr = (StudentManager) ref;
			String username=req.getParameter("username");
			System.out.println(username);
			if(sUmr.getStudent(username)){
				
				System.out.println("Password change sucessfully");
				resp.sendRedirect("/sameekshak/index.jsp");
			}else {
				System.out.println("Password could't change..");
				resp.sendRedirect("/sameekshak/index.jsp");
			}
		}catch(Exception e){

				System.out.println("Error in ChangePasswordServlet :"+e);
		}
	}

}
