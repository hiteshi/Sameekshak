/**
 * 
 */
package com.cdac.sameekshak.web.login;


import com.cdac.sameekshak.business.login.StudentManager;
import com.cdac.sameekshak.constant.Constants;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.entities.Test;
import com.cdac.sameekshak.helper.MonitorStudent;
import com.cdac.sameekshak.jndi.ContextUtils;


import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author Group-5
 *
 *	dear all do commenting at all appropriate places. 
 */
public class StudentLoginServlet extends HttpServlet{
	List<Student> stud;
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
		
		//		removing cache and other attributes for session tracking

		response.addHeader("Pragma","no-cache");
		response.setHeader("Cache-Control","no-cache,no-store,must-revalidate");
		response.addHeader("Cache-Control","pre-check=0,post-check=0");
		response.setDateHeader("Expires",0);
		
		//List<MonitorStudent> monitorStudent = null;
		System.out.println("request.getRemoteAddr() :"+request.getRemoteAddr());
		System.out.println("request.getRemoteHost() :"+request.getRemoteHost());
		//MonitorStudent ms = new MonitorStudent();
		//ms.setStudentId(request.getParameter("username"));
		//ms.setIp(request.getRemoteAddr());
		//Calendar cal = new GregorianCalendar();
		//ms.setLoginTime(""+cal.getTime());
		//ms.setStatus(true);
		
		//monitorStudent.add(ms);

		HttpSession session = request.getSession(true);
		//getServletContext().setAttribute("monitorStudent", monitorStudent);
		if (session == null) {
			response.sendRedirect("/sameekshak/index.jsp");
		}
		if(!session.getId().equals(request.getParameter("currentRequestSessionId"))){
			//System.out.println("sessionId="+sessId+"and inside="+session.getId());
			session.invalidate();
			response.sendRedirect("/sameekshak/index.jsp");

		}
		else{
			try {

				ContextUtils contextUtils = new ContextUtils();
				Context ctx = contextUtils.getInitialContext();

				Object ref = ctx.lookup("LoginManager");

				StudentManager sUmr = (StudentManager) ref;
				List<Test> tests=sUmr.getTests();
				request.setAttribute("tests", tests);
				String loginId = (String) request.getParameter("username");
				String password = (String) request.getParameter("password");

				Student student = sUmr.isStudentExist(loginId, password);

				if (student != null) {

					session.setAttribute(Constants.LOGINID, loginId);
					session.setAttribute("student",student);
					System.out.println("student list ko print karna he...................\n");
					stud=(List<Student>)getServletContext().getAttribute("studentsList");
					if(stud==null){
						
					}
					else
					{
						for(int i=0;i<stud.size();i++){
							System.out.println("student "+i+"  "+stud.get(i).getStudentName());
						}
						
					}

					RequestDispatcher dispatch = this.getServletContext().getRequestDispatcher("/view/jsp/student/AfterLogin.jsp");
					dispatch.forward(request, response);
				} else {
					response.sendRedirect("/sameekshak/index.jsp");
				}

			} catch (NamingException ex) {
				ex.printStackTrace();
			}



		}//---- else ------



	}//----- doPost ----------



}
