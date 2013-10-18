package com.cdac.sameekshak.web.student;



import java.io.IOException;

import javax.naming.Context;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.login.StudentManager;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.jndi.ContextUtils;

public class DisplayProfilePicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	public void init(ServletConfig conf) throws ServletException{

		//		initializing the current servlet
		super.init(conf);

	}//------- init ------


	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{

		//		calling the dopost() with current request and response objects so as to make only one function working

		doPost(request, response);


	}//----- doGet --------

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		System.out.println("Display Student Image called");
		HttpSession session = request.getSession(true);
		try {

			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();

			Object ref = ctx.lookup("LoginManager");

			StudentManager umr = (StudentManager) ref;
			Student student = (Student)session.getAttribute("student");
			byte[] image=umr.showStudentImage(student.getStudentId());
			response.setContentType("image/jpg");
			response.getOutputStream().write(image,0,image.length);
			response.getOutputStream().flush();
		} catch (Exception e){

			System.out.println("Error in DisplayProfilePicServlet : \n"+ e +"\n" );
		}

	}
}
