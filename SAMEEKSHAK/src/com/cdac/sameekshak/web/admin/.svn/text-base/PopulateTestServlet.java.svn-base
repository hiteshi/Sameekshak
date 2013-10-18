package com.cdac.sameekshak.web.admin;

import java.io.IOException;
import java.util.List;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.Miscllaneous;
import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

public class PopulateTestServlet extends AdminBusinessServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("populate Test servlet invoked");
		
		Miscllaneous misc;
		
		try{
			
			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();
			
			Object ref = ctx.lookup("TestManager");
			misc  = (Miscllaneous) ref;
			
			
		
					
			List<Test> populatedTest= misc.populateTest();
			
			System.out.println("after getting set of 3p ");
			
//				
			List<Administrator> adminList = misc.adminList();
			List<Student> studentList = misc.studentList();
			HttpSession session = req.getSession();
			session.setAttribute("populatedTest", populatedTest);
			session.setAttribute("adminList", adminList);
			session.setAttribute("studentList", studentList);
			
			
			System.out.println("after setting populatedTest List in session ");
			
		}
		catch(Exception e)
		{
			System.out.println("exception in servlet : "+e);
		}
		
	}

}
