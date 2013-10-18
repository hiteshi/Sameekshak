package com.cdac.sameekshak.web.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.StudentTestManager;
import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.jndi.ContextUtils;

public class CompileCodeServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	String filePath;
	public void init( ){
		// Get the file location where it would be stored.
		filePath = 
			getServletContext().getInitParameter("compile-save"); 
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
	throws ServletException, IOException {
		
		//resp.setContentType("text/html; charset=utf-8");
		
		System.out.println("CompileCodeServlet invoked...!!");
		try {
			PrintWriter writer = resp.getWriter(); 
			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();
			Object ref = ctx.lookup("TestManager");
			StudentTestManager smb = (StudentTestManager) ref;
			System.out.println("111");
			HttpSession session = req.getSession(true);
			String code=req.getParameter("code");
			String input=req.getParameter("inputtext");
			System.out.println("222");
			//System.out.println("code : \n"+code);
//			String fileName=req.getParameter("filename");
			String fileName=(String)session.getAttribute("className");
			
			Question ques = (Question) session.getAttribute("question");
			System.out.println("333");
			int questionId = ques.getQuestionId();
			Student student=(Student)session.getAttribute("student");
			System.out.println("444"+student.getStudentId());
			System.out.println(filePath+""+student.getStudentId()+"/Test");
			String result=smb.compileSaveCode(fileName, code, input,questionId,filePath+""+student.getStudentId()+"/Test/");
			//System.out.println("Result : "+result);
			//writer.println(result);
			writer.println("<textarea name='output_of_code'  cols='45' rows='15' readonly='readonly' id='output_of_code'style='width: 100%; height: 100%; resize: none'>"+result+"</textarea>");
			
			
		}catch(Exception e){
			System.out.println("Exception in CompileCodeServlet..."+e);
		}

	}

}
