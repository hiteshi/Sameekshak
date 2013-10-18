package com.cdac.sameekshak.web.student;

import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.StudentBusinessServlet;

public class showpfdquestion extends StudentBusinessServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = req.getSession(true);
		Question qus=(Question)session.getAttribute("question");
		
		
		
		byte[] image=qus.getStatement();
		res.setContentType("application/pdf");
		res.getOutputStream().write(image,0,image.length);
		res.getOutputStream().flush();
		
	}

}
