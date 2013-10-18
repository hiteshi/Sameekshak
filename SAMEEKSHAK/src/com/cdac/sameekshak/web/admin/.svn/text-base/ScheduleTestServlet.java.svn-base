/**
 * 
 */
package com.cdac.sameekshak.web.admin;

import java.io.IOException;
import java.sql.Date;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.CourseAdminTestManager;
import com.cdac.sameekshak.business.test.Miscllaneous;
import com.cdac.sameekshak.business.test.TestManagerBean;
import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

/**
 * @author Group-5
 *
 */
public class ScheduleTestServlet extends AdminBusinessServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		CourseAdminTestManager catMngr;
		Miscllaneous misc;
		TestManagerBean tmb = new TestManagerBean();
		
		
		try{
			
			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();
			HttpSession session = req.getSession();
			
			Object ref = ctx.lookup("TestManager");
			catMngr  = (CourseAdminTestManager) ref;
			misc = (Miscllaneous) ref;
			CourseAdminTestManager obj  = (CourseAdminTestManager) ref;
			
			Test scheduleTest = new Test();
			scheduleTest.setName(req.getParameter("testName"));
			Date date = dateParser(req.getParameter("scheduledDate"));
			scheduleTest.setScheduledDate(date);
			scheduleTest.setScheduledTime(Time.valueOf(req.getParameter("scheduledTime")));
			scheduleTest.setDuration(Integer.parseInt(req.getParameter("testDuration")));  
			scheduleTest.setRemarks(req.getParameter("testRemarks"));
			scheduleTest.setConductedBy(req.getParameter("conductedBy"));
			Administrator admin = (Administrator)session.getAttribute("currentAdmin");
			scheduleTest.setScheduledBy(admin.getAdminName());
			scheduleTest.setStatus("scheduled");
			if(obj.scheduleTest(scheduleTest))
				System.out.println("Save sucessfully");
			else
				System.out.println("Some error happend.. Could't scheduled the test...");
		
			System.out.println("after getting set of 3p ");
			
//			
			List<Test> populatedTest= misc.populateTest();
			
			session.setAttribute("populatedTest", populatedTest);
			
			
			
			System.out.println("after setting populatedTest List in session ");
			RequestDispatcher dispatch = this.getServletContext()
			.getRequestDispatcher("/view/jsp/admin/AdminAfterLogin.jsp");
			dispatch.forward(req, res);
			
		}
		catch(Exception e)
		{
			System.out.println("exception in servlet : "+e);
		}
		
		
	}
	public Date dateParser(String d) {
		try {
			String str_date = d;
			Date date;
			DateFormat formatter;
			formatter = new SimpleDateFormat("yyyy-MM-dd");

			java.util.Date utilDate = formatter.parse(str_date);
			date = new java.sql.Date(utilDate.getTime());

			return date;

		} catch (ParseException e) {
			System.out.println("Exception in dateParser :" + e);
		}
		return null;
	}
	
	

}
