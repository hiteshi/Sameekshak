package com.cdac.sameekshak.web.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*;

import com.cdac.sameekshak.business.test.CourseAdminTestManager;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.entities.*;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

public class GetStudentListServlet extends AdminBusinessServlet{
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		try{
			
			System.out.println("inside SetStudentLIst.....................year = ");
			
		PrintWriter writer = res.getWriter();
		ContextUtils contextUtils = new ContextUtils();
		Context ctx = contextUtils.getInitialContext();
		
		Object ref = ctx.lookup("TestManager");
		CourseAdminTestManager catm=(CourseAdminTestManager)ref;
		int year=Integer.parseInt(req.getParameter("cmd"));
		System.out.println("year = "+year);
		List<Student> students=catm.getEnrolledStudents(year);
		
		writer.print("<table>");
		for(int i=0;i<students.size();i++)
		{
			writer.print("<tr>");
			writer.print("<td>");
			writer.print("<input type=\"checkbox\" name=\"eligible\" id=\"eligible\"checked=\"checked\"value="+students.get(i).getStudentId()+" />");
			writer.print("</td>");
			
			writer.print("<td>");
			writer.print(""+students.get(i).getStudentId());
			writer.print("</td>");
			
			writer.print("<td>");

			writer.print(""+students.get(i).getStudentName());
			writer.print("</td>");
			
			writer.print("</tr>");
			
		}
		writer.print("</table>");
		writer.close();
		}catch(Exception e){
			System.out.println("...............exception in GetStudentListServlet "+e);
		}
	}
	
	
}
