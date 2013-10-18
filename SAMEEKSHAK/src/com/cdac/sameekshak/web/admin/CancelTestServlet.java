package com.cdac.sameekshak.web.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.CourseAdminTestManager;
import com.cdac.sameekshak.business.test.Miscllaneous;
import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

public class CancelTestServlet extends AdminBusinessServlet {


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String filePath;
	public void init( ){
		// Get the file location where it would be stored.
		filePath = 
			getServletContext().getInitParameter("question-download"); 
	}

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {

		/*ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();

			Object ref = ctx.lookup("TestManager");
			int testId = Integer.parseInt((String)req.getParameter("testId"));
			System.out.println("Test Id "+testId);

		 */

		System.out.println("inside start test servlet");
		try{
			HttpSession session = req.getSession(true);

			res.setContentType("text/html");
			int testId = Integer.parseInt((String)req.getParameter("testId"));
			System.out.println("Test Id "+testId);

			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();
			Object ref = ctx.lookup("TestManager");
			CourseAdminTestManager obj  = (CourseAdminTestManager) ref;
			
			obj.cancelTest(testId);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in StartTestServlet..........."+e);
		}

	}

}


