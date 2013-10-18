package com.cdac.sameekshak.web.admin;


// Import required java libraries
import java.io.File;
import org.apache.commons.fileupload.*;

import java.util.List;

import javax.jms.Session;
import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.cdac.sameekshak.business.test.CourseAdminTestManager;
import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Question;
import com.cdac.sameekshak.entities.Question_Type;
import com.cdac.sameekshak.entities.Test_Case;
import com.cdac.sameekshak.jndi.ContextUtils;

public class uploadServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String filePath;
	public void init( ){
		// Get the file location where it would be stored.
		filePath = 
			getServletContext().getInitParameter("file-upload"); 
	}
	public void doPost(HttpServletRequest req, 
			HttpServletResponse res)
	throws ServletException, java.io.IOException {
		 HttpSession session = req.getSession(true);
		res.setContentType("text/html");


		DiskFileItemFactory factory = new DiskFileItemFactory();
		// maximum size that will be stored in memory
		//factory.setSizeThreshold(maxMemSize);
		// Location to save data that is larger than maxMemSize.
		factory.setRepository(new File(filePath));

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		// maximum file size to be uploaded.
		//upload.setSizeMax( maxFileSize );
		System.out.println("where is the problem,,,,,,,,,,,,,,,,,,,,,");
		
		
		try{ 
			// Parse the req to get file items.
			@SuppressWarnings("rawtypes")
			
			List fileItems = upload.parseRequest(req);
					
				ContextUtils contextUtils = new ContextUtils();
				Context ctx = contextUtils.getInitialContext();
				Object ref = ctx.lookup("TestManager");
				CourseAdminTestManager obj  = (CourseAdminTestManager) ref;
				Administrator admin=(Administrator)session.getAttribute("currentAdmin");
				boolean result=obj.uploadFile(fileItems,filePath, admin);
				
				if(result)
				{
					RequestDispatcher dispatch = this.getServletContext()
					.getRequestDispatcher("/view/jsp/admin/AdminAfterLogin.jsp");
					dispatch.forward(req, res);
				}
				else{
					RequestDispatcher dispatch = this.getServletContext()
					.getRequestDispatcher("/view/jsp/generic/errorPage.html");
					dispatch.forward(req, res);
				}
				
				
				

		}catch(Exception ex) {
			System.out.println("Exception in uploadServlet----------- "+ex);
			RequestDispatcher dispatch = this.getServletContext()
			.getRequestDispatcher("/view/jsp/generic/errorPage.html");
			dispatch.forward(req, res);
		}

	}
	public void doGet(HttpServletRequest req, 
			HttpServletResponse res)
	throws ServletException, java.io.IOException {

		throw new ServletException("GET method used with " +
				getClass( ).getName( )+": POST method required.");
	} 
}
