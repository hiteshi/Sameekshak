package com.cdac.sameekshak.web.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.sameekshak.business.test.Miscllaneous;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

public class ControlTestSessionServlet extends AdminBusinessServlet {

	private static final long serialVersionUID = 1L;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// Servlet to get the test details to display in startTest JSP
		
		System.out.println("ControlTestSessionServlet invoked");

		Miscllaneous misc;
		
		try{
			
			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();
			
			Object ref = ctx.lookup("TestManager");
			misc  = (Miscllaneous) ref;
			PrintWriter writer = res.getWriter();
			int testId = Integer.parseInt((String)req.getParameter("testId"));
			System.out.println("Test Id "+testId);
			Test test = misc.getTestObject(testId);
			writer.println("<table>");
			writer.println("<tr><td>Test Id</td><td>:</td><td>"+test.getTestId()+"</td></tr>");
			writer.println("<tr><td>Test Name</td><td>:</td><td>"+test.getName()+"</td></tr>");
			writer.println("<tr><td>Date</td><td>:</td><td>"+test.getScheduledDate()+"</td></tr>");
			writer.println("<tr><td>Time</td><td>:</td><td>"+test.getScheduledTime()+"</td></tr>");
			writer.println("<tr><td>Duration</td><td>:</td><td>"+test.getDuration()+"</td></tr>");
			writer.println("<tr><td>Scheduled By</td><td>:</td><td>"+test.getScheduledBy()+"</td></tr>");
			writer.println("<tr><td>Remarks</td><td>:</td><td>"+test.getRemarks()+"</td></tr>");
			writer.println("</table");
			
		}catch (Exception e){
			
			System.out.println("Exception in ControlTestSessionServlet : "+e);
		}
		
	}

}
