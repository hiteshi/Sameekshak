package com.cdac.sameekshak.web.student;

import java.io.IOException;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.StudentTestManager;
import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.helper.TestTimer;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.StudentBusinessServlet;

public class InstructionMenuServlet  extends StudentBusinessServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int timming[]=new int[3];
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
	throws ServletException, IOException {

		try {
			HttpSession session = request.getSession(true);
			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();

			Object ref = ctx.lookup("TestManager");

			StudentTestManager stm=(StudentTestManager)ref;
			int questionId=Integer.parseInt(request.getParameter("questionId"));
			//int questionId=1122358;
			System.out.println("question id============"+ questionId);
			
			Question question=stm.getQuestionObject(questionId);
			System.out.println("inside InstuctionMenuServlet question="+question);
			session.setAttribute("question", question);
			TestTimer testTimer=new TestTimer();
			String startTime=testTimer.getTime();
			startTime=testTimer.dateFormater(startTime);
			
			session.setAttribute("startTime", startTime);
			System.out.println("inside InstuctionMenuServlet full question "+question.getStatement());
			
			RequestDispatcher dispatch = this.getServletContext().getRequestDispatcher("/view/jsp/student/QuestionPage.jsp");
			dispatch.forward(request, response);
			
			

		} catch (NamingException ex) {
			ex.printStackTrace();
		}

	}
}