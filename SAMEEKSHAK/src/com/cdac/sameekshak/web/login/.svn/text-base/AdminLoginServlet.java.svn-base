/**
 * 
 */
package com.cdac.sameekshak.web.login;

import java.io.IOException;
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

import com.cdac.sameekshak.business.login.AdminManager;
import com.cdac.sameekshak.business.login.StudentManager;
import com.cdac.sameekshak.constant.Constants;
import com.cdac.sameekshak.entities.Administrator;
import com.cdac.sameekshak.entities.Role;
import com.cdac.sameekshak.entities.Student;
import com.cdac.sameekshak.jndi.ContextUtils;

/**
 * @author d1153025
 *
 */
public class AdminLoginServlet extends HttpServlet{
	
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
		
        HttpSession session = request.getSession(true);
		if (session == null) {
			response.sendRedirect("/sameekshak/Admin.jsp");
		}
		if(!session.getId().equals(request.getParameter("currentRequestSessionId"))){
			//System.out.println("sessionId="+sessId+"and inside="+session.getId());
			session.invalidate();
			response.sendRedirect("/sameekshak/Admin.jsp");
			
		}
		else{
			try {
				
				ContextUtils contextUtils = new ContextUtils();
				Context ctx = contextUtils.getInitialContext();
				
				Object ref = ctx.lookup("LoginManager");
				
				AdminManager sUmr = (AdminManager) ref;
				
				String loginId = (String) request.getParameter("username");
				String password = (String) request.getParameter("password");
				
				Administrator currentAdmin = sUmr.isAdminExist(loginId, password);
				
				if (currentAdmin != null) {
					
					session.setAttribute(Constants.LOGINID, loginId);
					session.setAttribute("currentAdmin",currentAdmin);

					
					
					List<Role> adminRoles = sUmr.setRoles(currentAdmin.getAdminId());					
					int roleValue = calculateRoleValue(adminRoles);
					
					
//				 	role value calculated on basis of courseAdmin(4), FacultyAdmin(2), TestAdmin(1)
//				 	and then setting the role value into the session
					session.setAttribute("roleValue", roleValue);
					
					System.out.println(" current admin role value = "+roleValue);
					
					RequestDispatcher dispatch = this.getServletContext().getRequestDispatcher("/view/jsp/admin/AdminAfterLogin.jsp");
					dispatch.forward(request, response);
				} else {
					response.sendRedirect("/sameekshak/Admin.jsp");
				}

			} catch (NamingException ex) {
				ex.printStackTrace();
			}
			
			
			
		}//---- else ------
		
		
		
	}//----- doPost ----------
	
	
	int calculateRoleValue (List<Role> currentRole){
		
		int roleValue = 0;
		
		for (int i = 0; i < currentRole.size(); i++) {
			 
			if (currentRole.get(i).getRoleId() == 222)
				roleValue+=4;
			else if (currentRole.get(i).getRoleId() == 223)
				roleValue+=2;
			else if (currentRole.get(i).getRoleId() == 224)
				roleValue+=1;
				
		}
		
		return roleValue;
		
		
	}
	
	

}
