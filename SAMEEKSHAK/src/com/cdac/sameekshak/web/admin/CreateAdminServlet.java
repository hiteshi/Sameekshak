package com.cdac.sameekshak.web.admin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.cdac.sameekshak.business.profile.CourseAdminProfileManager;
import com.cdac.sameekshak.business.profile.ProfileManagerBean;
import com.cdac.sameekshak.business.test.CourseAdminTestManager;
import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Role;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.jndi.ContextUtils;
import com.cdac.sameekshak.web.generic.AdminBusinessServlet;

public class CreateAdminServlet extends AdminBusinessServlet {

	private static final long serialVersionUID = 1L;

	String filePath;
	String createUser;
	public void init( ){
		// Get the file location where it would be stored.
		filePath = 
			getServletContext().getInitParameter("file-upload");  
	}
	
	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		
		System.out.println("CreateAdminServlet invloked...");
		// servlet to create student account in sameeskhak
		
		/*Student student = new Student();
		student.setStudentId((String)req.getParameter("studentId"));
		student.setCourseId(req.getParameter("courseId"));
		student.setStudentName(req.getParameter("studentName"));
		student.setStudentEmailId(req.getParameter("studentEmailId"));
		student.setStudentPhoneNo(Long.parseLong(req.getParameter("studentPhoneNo")));
		String path = req.getParameter("image");*/
		
		res.setContentType("text/html");
		
		String[] arrayRole = req.getParameterValues("admin");
		
		List<Role> roleList = new ArrayList<Role>(0);
		
		
		
		int roleValue=0;
		
		for (int i=0;i<arrayRole.length;i++){
			
			Role role = new Role();
			
			if (arrayRole[i].equals("testAdmincb")){
				
				role.setRoleId(224);
				roleValue+=1;
			}
			if (arrayRole[i].equals("courseAdmincb")){
				
				role.setRoleId(222);
				roleValue+=4;
			}
			if (arrayRole[i].equals("facultyAdmincb")){
				
				role.setRoleId(223);
				roleValue+=2;
			}
			
			roleList.add(role);
		
		}
		
		
		
		
		
		System.out.println(" rloeValue = "+roleValue);


		DiskFileItemFactory factory = new DiskFileItemFactory();
		// maximum size that will be stored in memory
		//factory.setSizeThreshold(maxMemSize);
		// Location to save data that is larger than maxMemSize.
		factory.setRepository(new File(filePath));

		// Create a new file upload handler
		ServletFileUpload upload = new ServletFileUpload(factory);
		
		try{ 
			// Parse the req to get file items.
			@SuppressWarnings("rawtypes")
			
			List fileItems = upload.parseRequest(req);
					
				ContextUtils contextUtils = new ContextUtils();
				Context ctx = contextUtils.getInitialContext();
				Object ref = ctx.lookup("ProfieManagerBean");
				CourseAdminProfileManager pmb  = (CourseAdminProfileManager) ref;
				
				
				if(pmb.createAdmin(fileItems,filePath,createUser,roleList))
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

}
