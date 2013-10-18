package com.cdac.sameekshak.web.student;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.helper.TestTimer;
import com.cdac.sameekshak.web.generic.StudentBusinessServlet;

public class QuestionTimingServlet extends StudentBusinessServlet {

	private static final long serialVersionUID = 1L;
	int timming[]=new int[3];
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		//System.out.println("inside QuestionTimmingServlet...... ");
		HttpSession session = req.getSession(true);
		String className=req.getParameter("fileName");
		//System.out.println("class name="+className);
		session.setAttribute("className",className);
		String codeType=req.getParameter("codeType");
		//System.out.println("codeType="+codeType);
		session.setAttribute("codeType",codeType);
		PrintWriter writer = res.getWriter();
		Question question=(Question)session.getAttribute("question");
		//System.out.println("inside QuestionTimmingServlet...... question ="+question);
		int timeDuration=question.getReadingDuration();

		//System.out.println("inside QuestionTimmingServlet...... timeDuration ="+timeDuration);
		String startTime=req.getParameter("cmd");
		
		TestTimer testTimer=new TestTimer();
		startTime=(String)session.getAttribute("startTime");
		startTime=testTimer.dateFormater(startTime);
		
		
		String endTime =testTimer.getTime();
		endTime=testTimer.dateFormater(endTime);
		
		//System.out.println(" inside QuestionTimmingServlet...... sartTime= "+startTime+"   EndTime = "+endTime);
		
		String newTime=testTimer.parse_Time_Min(startTime, endTime,timeDuration);
		
		
				
		//System.out.println(" inside QuestionTimmingServlet...... timeleft = "+newTime);
		if(newTime.equals("00:00:50")){
			writer.print("TimeOut");
			System.out.println("inside Timeout........................."+newTime);
		} else {
			writer.print(newTime);
		}
		
		
		//writer.close();  	
	}
}