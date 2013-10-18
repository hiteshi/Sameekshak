package com.cdac.sameekshak.web.student;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.web.generic.StudentBusinessServlet;
import com.cdac.sameekshak.helper.*;

public class TimingServlet extends StudentBusinessServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int timming[]=new int[3];
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
	throws ServletException, IOException {
		HttpSession session=req.getSession(true);
		//System.out.println("inside TimingServlet.....");
		PrintWriter writer = res.getWriter();
		Test test=(Test)getServletContext().getAttribute("test");

		int timeDuration=test.getDuration();
		Question question = (Question)session.getAttribute("question");
		int read=question.getReadingDuration();
		read=0;
		String startTime=req.getParameter("cmd");

		//System.out.println("inside TimingServlet..... timeDuration = "+timeDuration+"  read= "+read+"  startTime = "+startTime);

		TestTimer testTimer=new TestTimer();
		startTime=(String)session.getAttribute("startTime");
		startTime=testTimer.dateFormater(startTime);


		String endTime =testTimer.getTime();
		endTime=testTimer.dateFormater(endTime);
		String newTime=testTimer.parse_Time(startTime, endTime,timeDuration,read);
		//System.out.println("inside TimingServlet.....newTime = "+newTime);

		if(newTime.equals("00:00:00")){
			newTime="TimeOut";
			writer.print(newTime);
			//System.out.println("inside TimingServlet.....newTime = "+newTime);

		}
		else{
			
			writer.println(newTime);
		}
		writer.close();  	
	}
}
