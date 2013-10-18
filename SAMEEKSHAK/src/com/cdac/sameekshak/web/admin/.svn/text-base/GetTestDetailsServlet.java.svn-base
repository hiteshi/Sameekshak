package com.cdac.sameekshak.web.admin;

import java.io.IOException;
import java.util.List;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.CourseAdminTestManager;
import com.cdac.sameekshak.business.test.Miscllaneous;
import com.cdac.sameekshak.business.test.TestManagerBean;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

public class GetTestDetailsServlet extends AdminBusinessServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		
		System.out.println("GetTestDetailsServlet invoked");
		CourseAdminTestManager catMngr;
		Miscllaneous misc;
		try{

			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();


			Object ref = ctx.lookup("TestManager");
			catMngr  = (CourseAdminTestManager) ref;
			misc = (Miscllaneous) ref;
			List<Test> populatedTest= misc.populateTest();

			HttpSession session = req.getSession();
			session.setAttribute("populatedTest", populatedTest);
		}catch (Exception e){
			
		}

		
	}
}
