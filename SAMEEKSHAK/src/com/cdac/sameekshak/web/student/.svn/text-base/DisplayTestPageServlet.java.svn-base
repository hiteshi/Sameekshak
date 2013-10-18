package com.cdac.sameekshak.web.student;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cdac.sameekshak.web.generic.StudentBusinessServlet;

public class DisplayTestPageServlet extends StudentBusinessServlet {


	private static final long serialVersionUID = 1L;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		System.out.println(" DisplayTestPageServlet invoked...");
		RequestDispatcher dispatch = this.getServletContext().getRequestDispatcher("/view/jsp/student/testPage.jsp");
		dispatch.forward(req, res);
	}

}
