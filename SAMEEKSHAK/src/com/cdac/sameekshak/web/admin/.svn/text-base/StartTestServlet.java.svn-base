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

public class StartTestServlet extends AdminBusinessServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
		List<Student> Students=obj.eligibleStudent(testId);
		
		
		getServletContext().setAttribute("studentsList", Students);
		Test test=obj.getTestObject(testId);
		System.out.println(".......... inside StartTestServlet TestId = "+test.getTestId());
		List<Question> ques=obj.getQuestionList(testId);
				
		System.out.println(".......... inside StartTestServlet qUESTION oBJECT = "+ques);
		
		for(int i=0;i<ques.size();i++){
		
			System.out.println(".......... inside StartTestServlet QuestionId "+i+" =  "+ques.get(i).getQuestionId());
			
				
		}
		getServletContext().setAttribute("questionList", ques);
		getServletContext().setAttribute("test", test);
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("error in StartTestServlet..........."+e);
		}
		
	}

}
