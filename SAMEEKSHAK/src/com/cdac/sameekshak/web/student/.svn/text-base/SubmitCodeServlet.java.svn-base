/**
 * 
 */
package com.cdac.sameekshak.web.student;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.naming.Context;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cdac.sameekshak.business.test.StudentTestManager;
import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.entities.Test_Case;
import com.cdac.sameekshak.jndi.ContextUtils;

/**
 * @author d1153025
 *
 */
public class SubmitCodeServlet extends HttpServlet{
	
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
		
		
		System.out.println("SubmitCodeServlet invoked...!!");
		try {
			PrintWriter writer = resp.getWriter(); 
			ContextUtils contextUtils = new ContextUtils();
			Context ctx = contextUtils.getInitialContext();
			Object ref = ctx.lookup("TestManager");
			StudentTestManager smb = (StudentTestManager) ref;

			HttpSession session = req.getSession(true);
			String code=req.getParameter("code");
			String fileName=(String)session.getAttribute("className");
//			------------------------------------------------------
			Question ques = (Question) session.getAttribute("question");
			int questionId = ques.getQuestionId();
			
			List<Test_Case> listOfTestCases = smb.getNumberofEvaluationCases(questionId);
			
			String returnResultToAjax = "";
			
			System.out.println(" question id = "+questionId);
			
			System.out.println(" size of list of test cases =  "+listOfTestCases.size());
			
			for (int looper=0;looper<listOfTestCases.size();looper++){
				
				String input = listOfTestCases.get(looper).getInput();
				
				System.out.println(" input =  "+input);
				
				Student student=(Student)session.getAttribute("student");
				
				String result=smb.compileSaveCode(fileName, code, input, questionId, filePath+""+student.getStudentId()+"/Test/");
				
				String evaluationOutput = listOfTestCases.get(looper).getOutput();
				
				System.out.println(" result of student code =  "+result+" evaluationOutput = "+ evaluationOutput);
				
				if (result.equals(evaluationOutput)){
					
					returnResultToAjax+=1;
					
				}
				else 
					returnResultToAjax+=0;
				
							
			}
			
			System.out.println("final result received : "+returnResultToAjax);
			int finalReturnString = Integer.parseInt(returnResultToAjax);
			writer.print(returnResultToAjax);
			
			//System.out.println("Result : "+result);
			//writer.println(result);
//			writer.println("<textarea name='output_of_code'  cols='45' rows='15' readonly='readonly' id='output_of_code'style='width: 100%; height: 100%; resize: none'>"+result+"</textarea>");
			
			
		}catch(Exception e){
			System.out.println("Exception in SubmitCodeServlet..."+e);
		}

	}

}
