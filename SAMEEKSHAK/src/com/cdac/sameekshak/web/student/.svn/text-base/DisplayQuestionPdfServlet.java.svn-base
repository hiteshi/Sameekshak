package com.cdac.sameekshak.web.student;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.StudentTestManager;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.jndi.ContextUtils;

public class DisplayQuestionPdfServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		System.out.println("DisplayQuestionPdfServlet invoked..");
		HttpSession session = req.getSession(true);
		/*try {

			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();

			Object ref = ctx.lookup("LoginManager");

			StudentTestManager obj=(StudentTestManager)ref;
			Student student = (Student)session.getAttribute("student");
			int testId= (Integer)getServletContext().getAttribute("testID");
			obj.viewPdfQuestion(student.getStudentId(),testId);
			
			byte[] image=umr.showStudentImage(student.getStudentId());
			
			*//*******************************************************//*
			
			String filename="testid + questionid + .pdf";
			
			*//******************************************************//*
			resp.setContentType("image/jpg");
			resp.getOutputStream().write(image,0,image.length);
			resp.getOutputStream().flush();
			
			resp.reset();
	        resp.setContentType("application/pdf");
	        resp.setHeader("cache-control", "no-cache");
	        resp.setHeader("Content-disposition", "attachment; filename=" + filename);
			
		} catch (Exception e){

			System.out.println("Error in DisplayQuestionPdfServlet : \n"+ e);
		}*/
		
	}

}
