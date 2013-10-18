<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<%@page import="com.cdac.sameekshak.entities.Student"%>
<%@page import="com.cdac.sameekshak.entities.Course"%>

<%@page import="com.cdac.sameekshak.entities.Test"%>
<%@page import="java.util.*"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%
	Student student = (Student) session.getAttribute("student");
	List<Student> stud = (List<Student>) getServletContext()
			.getAttribute("studentsList");
	System.out.println("stud object " + stud);
	List<Test> tests = (List<Test>) request.getAttribute("tests");
%>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>afterlogin</title>
<link href="/sameekshak/view/css/afterLogin.css" rel="stylesheet"
	type="text/css" />
<link rel='stylesheet' href='/sameekshak/view/css/popbox.css'
	type='text/css' media='screen' charset='utf-8' />

<!-- <script src="/sameekshak/view/js/jquery-1.7.2.js"></script> -->
<script src="/sameekshak/view/js/timer.js"></script>
<script type='text/javascript' charset='utf-8'
	src='/sameekshak/view/js/jquery.js'></script>
<script type='text/javascript' charset='utf-8'
	src='/sameekshak/view/js/popbox.js'></script>
	<script type="text/javascript"	src="/sameekshak/view/js/loadPages.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	 $('.popbox').popbox();
  });
 	window.onload=Tick(); 
	function Tick() 
	{ 
		alert("inside onload function");
		for(var i=0;i<stud.size();)
		
	}
</script>

<style type='text/css' media='screen'>
a {
	color: #999;
	text-decoration: none;
}

a:link {
	color: #42413C;
	text-decoration: none;
}

label {
	display: block;
}

form {
	margin: 25px;
	text-align: left
}

form input[type=text] {
	padding: 5px;
	width: 90%;
	border: solid 1px #CCC;
}

form textarea {
	padding: 5px;
	width: 90%;
	border: solid 1px #CCC;
	height: 100px;
}
.pratikshak {
	visibility: hidden;
	background-color: silver;
	position: absolute;
	z-index: 100;
	height: 100%;
	width: 100%;
	opacity: 0.8;
}

.box {
	width: 350px;
}
</style>
</head>

<body>

	<div id="pratikshak" class="pratikshak" align="center" 
	
	<%if (stud != null) {

				boolean started = false;
				for (int i = 0; i < stud.size(); i++) {
					System.out.println("function me gusA " + i);

					if (student.getStudentId().equals(
							stud.get(i).getStudentId())) {
						System.out.println(student.getStudentId() + " = "
								+ stud.get(i).getStudentId());
						started = true;
					}
				}
				if (started) {%>
					style="visibility: visible" <%} else {%>
					style="visibility: hidden"
					<%}
			} else {%>
					style="visibility: hidden" <%}%>><a  href="view/jsp/student/InstructionMenu.jsp"><img src="/sameekshak/view/images/Coding.png" alt="start test" /> </a>
					<p> Click to Proceed for Test </p>
		
	</div>
	<div class="after_login_content" id="after_login_content">
		<table width="100%" border="1px" class="after_login_header_table">
			<caption>&nbsp;</caption>
			<tr>
				<td width="205" height="166"><table width="100%" height="151"
						border="0">
						<tr>
							<td><img src="/sameekshak/studentImage" alt="User Image"
								name="coder_image" width="195" height="200" align="middle"
								id="coder_image" />
							</td>
						</tr>
						<tr>
							<td><div align="center"><%=student.getStudentId()%></div>
							</td>
						</tr>
					</table>
				</td>
				<td width="831"><div class="name_display" align="right">
						<table width="100%" height="217" border="0">
							<tr>
								<td height="70" colspan="3"><div align="center"><img src="/sameekshak/view/images/sameekshak5.png"" alt="sameeksahak" /></div>
								</td>
							</tr>
							<tr>
								<td height="70" colspan="2"><%=student.getStudentName()%></td>
								<td width="23%"><%=student.getCourse().getCourseName()%> -
									<%=student.getEnrolledYear()%></td>
							</tr>
							<tr>
								<td width="23%" height="67"><%=student.getStudentPhoneNo()%></td>
								<td width="54%"><%=student.getStudentEmailId()%></td>
								<td><a href="/sameekshak/studentLogout">Logout</a>
								</td>
							</tr>
						</table>
						<!-- <a href="/sameekshak/studentChangePassword">change password</a> -->

						<!-- <div class='popbox'>
							<a class='open' href='#'> <img src='plus.png'
								style='width: 14px; position: relative;'>Change Password 
							</a> 

							<div class='collapse'>
								<div class='box'>
									<div class='arrow'></div>
									<div class='arrow-border'></div>

									<form id="subForm">
										<div class="input">
											<input type="text" name="oldpassword" id="oldpassword"
												placeholder="Old Password" />
										</div>
										<div class="input">
											<input type="text" name="newpassword" id="newpassword"
												placeholder="New Password" />
										</div>
										<div class="input">
											<input type="text" name="renewpassword" id="renewpassword"
												placeholder="Re-Enter New Password" />
										</div>
										<input type="submit" value="Change Password" /> <a href="#"
											class="close">Cancel</a>
									</form>

								</div>
							</div>
						</div>-->
				</td>
				<td width="400">&nbsp;</td>
			</tr>
			<tr>
				<td height="166"><a href="javascript:getProfile('Student')">Student Profile</a> <br />
								<a href="javascript:getProfile('Admin')">Admin Profile</a></td>
				<td rowspan="3"><div id="result"></div></td>
				<td rowspan="2">
					<table>
						<%
							for (int i = 0; i < tests.size(); i++) {
						%>
						<tr>
							<td><%=tests.get(i).getName()%> scheduled on <%=tests.get(i).getScheduledDate()%>
							</td>
						</tr>

						<%
							}
						%>

					</table></td>
			</tr>
			<tr>
				<td height="166"></td>
			</tr>
			<tr>
				<!-- /sameekshak/startTestDisplay -->
				<td height="166"></td>
				<td>
<!-- 				<a  href="view/jsp/student/InstructionMenu.jsp" -->
<!-- 					id="StartTest" name="StartTest"  -->
<%-- 					<%if (stud != null) { --%>

<!-- 				boolean started = false; -->
<!-- 				for (int i = 0; i < stud.size(); i++) { -->
<!-- 					System.out.println("function me gusA " + i); -->

<!-- 					if (student.getStudentId().equals( -->
<!-- 							stud.get(i).getStudentId())) { -->
<!-- 						System.out.println(student.getStudentId() + " = " -->
<!-- 								+ stud.get(i).getStudentId()); -->
<!-- 						started = true; -->
<!-- 					} -->
<!-- 				} -->
<!-- 				if (started) {%> -->
<%-- 					style="visibility: visible" <%} else {%> --%>
<!-- 					style="visibility: hidden" -->
<%-- 					<%} --%>
<!-- 			} else {%> -->
<%-- 					style="visibility: hidden" <%}%>><img src="/sameekshak/view/images/Coding.png" alt="start test" /> </a> --%>
					
					
					
					
					
					
					
				</td>
			</tr>
		</table>
		<p>&nbsp;</p>
		<table width="100%" border="0">
			<tr>
				<td><img alt="cdac" src="/sameekshak/view/images/C-DAC-Logo.jpg" width="75" height="50px">
				</td>
				<td>This web-application is developed and maitained by Centre for Development of Advanced Computing 
(CDAC), DIT, MoCIT, Government of India.All rights reserved.</td>
			</tr>
		</table>
		<p>&nbsp;</p>
	</div>

</body>
</html>