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

public class StartTestDetailsServlet extends AdminBusinessServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside StartTestDetailsServlet");
		Miscllaneous misc;
		
		try{
			
			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();
			
			Object ref = ctx.lookup("TestManager");
			misc  = (Miscllaneous) ref;
			PrintWriter writer = res.getWriter();
			
			int testId = Integer.parseInt((String)req.getParameter("val"));
			//System.out.println("in bar load ----------------1 .. testId received = "+testId);
					
			Test test = misc.getTestObject(testId);
			
			//System.out.println("in bar load ----------------1 .. test object = "+test);
			
//		-----------------------------------writer.println("<table border=\"1\">");
			
			/*writer.println("<script src='/sameekshak/view/js/jquery.min.js'></script>");
			writer.println("<script src='/sameekshak/view/js/jquery-ui.min.js'></script>");
			writer.println("<link href='/sameekshak/view/css/jquery-ui.css' rel='stylesheet' type='text/css' />");
			writer.println("<script>");
			writer.println("$(document).ready(function() {");
			writer.println("$( '#scheduledDate' ).datepicker({dateFormat: 'yy-mm-dd', yearRange: '1950:2025', showAnim: 'fold', showOptions: {showSpeed:'0'},  changeMonth:true,changeYear:true});");
			writer.println("});");
			writer.println("</script>");*/
			
			
			writer.println("<tr>");
			
			writer.println("<td><font color='#4B8DF8'>Test ID</font></td>");
			writer.println("<td><input size='15' name='testId' id='testId' value='"+test.getTestId()+"' type='text' readonly='readonly'></input>");
			writer.println("</td>");
			writer.println("</tr>");
			writer.println("<tr>");
			writer.println("<td><font color='#4B8DF8'>Test Name</font></td>");
			writer.println("<td><input size='15' name='testName' id='testName' value='"+test.getName()+"' type='text' readonly='readonly'></input>");
			writer.println("</td>");
			writer.println("</tr>");
			writer.println("<tr>");
			writer.println("<td><font color='#4B8DF8'>Date</font></td>");
			writer.println("<td><input size='15' name='scheduledDate' value='"+test.getScheduledDate()+"' id='scheduledDate' type='text' readonly='readonly' />");
			writer.println("</td>");
			writer.println("</tr>");
			writer.println("<tr>");
			writer.println("<td><font color='#4B8DF8'>Time</font></td>");
			writer.println("<td><input size='15' name='scheduledTime' id='scheduledTime' value='"+test.getScheduledTime()+"' type='text' readonly='readonly' />");
			writer.println("</td>");
			writer.println("</tr>");
			writer.println("<tr>");
			writer.println("<td><font color='#4B8DF8'>Duration</font></td>");
			writer.println("<td><input size='15' name='testDuration' id='testDuration' value='"+test.getDuration()+"' type='text' readonly='readonly'>");
			writer.println("</td>");
			writer.println("</tr>");
			writer.println("<tr>");
			writer.println("<td><font color='#4B8DF8'>Remarks</font></td>");
			writer.println("<td><textarea name='testRemarks' cols='35' rows='10' id='testRemarks' style='resize: none' readonly='readonly'>"+test.getRemarks()+"</textarea>");
			writer.println("</td>");
			writer.println("</tr>");
			writer.println("<tr>");
			writer.println("<td><font color='#4B8DF8'>Scheduled by</font></td>");
			writer.println("<td><input size='15' name='scheduledBy' id='scheduledBy' value='"+test.getScheduledBy()+"' type='text' readonly='readonly'>");
			writer.println("</td>");
			writer.println("</tr>");
					
			writer.println("<tr>");
			writer.println("<td><font color='#4B8DF8'>Conducted by</font></td>");
			writer.println("<td><input size='15' name='conductedBy' id='conductedBy' value='"+test.getConductedBy()+"' type='text' readonly='readonly'>");
			writer.println("</td>");
			writer.println("</tr>");
			/*StartTestFlag obj = new StartTestFlag();
			if(obj.getFlag()){
				*/
				writer.println("<tr>");
				writer.println("<td><form action='stopTestSession' method='post'><input id='stopTestButton' name='stopTestButton' value='Stop Test Session' type='submit'></input></form>");	
				writer.println("</td>");
				writer.println("</tr>");
			/*	
			} else {
			*/
				writer.println("<tr>");
				writer.println("<td><form action='startTestSession' method='post'><input id='startTestButton' name='startTestButton' value='Start Test Session' type='submit'></input></form>");	
				writer.println("</td>");
				writer.println("</tr>");
				
			/*}*/

			System.out.println("after setting populatedTest List in session ");
			
		}
		catch(Exception e)
		{
			System.out.println("exception in servlet : "+e);
		}
		
	}

}
