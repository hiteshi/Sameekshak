package com.cdac.sameekshak.web.student;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.login.StudentManager;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.StudentBusinessServlet;

public class ChangePasswordServlet extends StudentBusinessServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		// Servlet to change Student Password

		System.out.println("inside ChangePasswordServlet");
		HttpSession session = req.getSession(true);
		if (session == null) {
			res.sendRedirect("/sameekshak/index.jsp");
		}

		try {

			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();

			Object ref = ctx.lookup("LoginManager");
			String username=req.getParameter("");
			StudentManager sUmr = (StudentManager) ref;
			if(sUmr.getStudent(username)){
				
				System.out.println("Password change sucessfully");
			}else {
				System.out.println("Password could't change..");
			}
		}catch(Exception e){

				System.out.println("Error in ChangePasswordServlet :"+e);
		}

	}

}
