package com.cdac.sameekshak.web.admin;

import java.io.IOException;
import java.util.List;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.sameekshak.business.test.CourseAdminTestManager;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

public class EligibleStudetListServlet extends AdminBusinessServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// 
		System.out.println(" EligibleStudetListServlet invoked...");
		String[] selected = req.getParameterValues("eligible");
		System.out.println("------------------no of selected students = "+selected.length);
		String testId=req.getParameter("testDetails");
		System.out.println("nikhil testId = "+testId);
		

		for(int i=0;i<selected.length;i++){
			 System.out.println("nikhil  student id = --------- "+selected[i]);
			 
		 }
		try{
		ContextUtils contextUtils = new ContextUtils();
		Context ctx = contextUtils.getInitialContext();
		Object ref = ctx.lookup("TestManager");
		CourseAdminTestManager obj  = (CourseAdminTestManager) ref;
		
		if(obj.uploadEligibleStudent(selected, testId))
		{
		
		RequestDispatcher dispatch = this.getServletContext()
		.getRequestDispatcher("/view/jsp/admin/AdminAfterLogin.jsp");
		dispatch.forward(req, res);
		}
		else{
			RequestDispatcher dispatch = this.getServletContext()
			.getRequestDispatcher("/view/jsp/generic/errorPage.jsp");
			dispatch.forward(req, res);
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
