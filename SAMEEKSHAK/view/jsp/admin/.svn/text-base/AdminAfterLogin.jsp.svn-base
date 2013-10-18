<%@page import="com.cdac.sameekshak.entities.Role"%>
<%@page import="java.util.List"%>
<%@page import="com.cdac.sameekshak.entities.Administrator"%>
<%@ page contentType="text/html; charset=utf-8" language="java"
	import="java.sql.*" errorPage=""%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<!-- getting role value so as to define proper roles -->
<%! 
// 	modify length as per needs
	String[] testLinks = new String[7];
	int roleValue;

%>

<%
	Administrator admin = (Administrator) session
			.getAttribute("currentAdmin");

	Integer roleValueObject = (Integer)session.getAttribute("roleValue");
	int roleValue = roleValueObject.intValue();
	System.out.println(" role value in jsp : " + roleValue);

	if (roleValue == 1) {
		
// 			only TestAdmin

		testLinks[0]="Start Test";
		testLinks[1]="Ongoing Test";
		testLinks[2]="-";
		testLinks[3]="-";
		testLinks[4]="-";
		testLinks[5]="-";
		testLinks[6]="-";
// 		testLinks[7]="-";
// 		testLinks[8]="-";
		
		
	} else if (roleValue == 2) {
		
// 		only FacultyAdmin 

		testLinks[0]="Upload Questions";
		testLinks[1]="-";
		testLinks[2]="-";
		testLinks[3]="-";
		testLinks[4]="-";
		testLinks[5]="-";
		testLinks[6]="-";
// 		testLinks[7]="-";
// 		testLinks[8]="-";
		

	} else if (roleValue == 3) {
		
// 		FacultyAdmin + TestAdmin
		
		testLinks[0]="Upload Questions";
		testLinks[1]="Start Test";
		testLinks[2]="Ongoing Test";
		testLinks[3]="-";
		testLinks[4]="-";
		testLinks[5]="-";
		testLinks[6]="-";
// 		testLinks[7]="-";
// 		testLinks[8]="-";

	} else if (roleValue == 4) {
		
// 		only courseAdmin

		testLinks[0]="Schedule New";
		testLinks[1]="Reschedule";
		testLinks[2]="-";
		testLinks[3]="-";
		testLinks[4]="-";
		testLinks[5]="-";
		testLinks[6]="-";
// 		testLinks[7]="-";
// 		testLinks[8]="-";
		
		

	} else if (roleValue == 5) {
		
// 		CourseAdmin + TestAdmin

		testLinks[0]="Schedule New";
		testLinks[1]="Reschedule";
		testLinks[2]="Start Test";
		testLinks[3]="Ongoing Test";
		testLinks[4]="-";
		testLinks[5]="-";
		testLinks[6]="-";
// 		testLinks[7]="-";
// 		testLinks[8]="-";
		

	} else if (roleValue == 6) {
		
// 		CourseAdmin + FacultyAdmin
		testLinks[0]="Schedule New";
		testLinks[1]="Reschedule";
		testLinks[2]="Upload Questions";
		testLinks[3]="-";
		testLinks[4]="-";
		testLinks[5]="-";
		testLinks[6]="-";
// 		testLinks[7]="-";
// 		testLinks[8]="-";

	} else if (roleValue == 7) {

// 		all roles

		testLinks[0]="Schedule New";
		testLinks[1]="Reschedule";
		testLinks[2]="Upload Questions";
		testLinks[3]="Start Test";
		testLinks[4]="Ongoing Test";
		testLinks[5]="Cancel Test";
		testLinks[6]="-";
// 		testLinks[7]="-";
// 		testLinks[8]="-";
		
	}
	
	for (int i=0;i<testLinks.length;i++){
		
		System.out.println("testLinks["+i+"] = "+testLinks[i]);
	}
	
	
	
%>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>welcome Admin to SAMEEKSHAK...</title>
<link href="/sameekshak/view/css/afterLogin.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="/sameekshak/view/js/jquery-1.7.2.js"></script>
<script type="text/javascript"	src="/sameekshak/view/js/admin_after_login.js"></script>
<script type="text/javascript"	src="/sameekshak/view/js/loadPages.js"></script>

</head>

<body>

	<div class="after_login_content" id="after_login_content">
		<table width="100%" border="1" class="after_login_header_table">
			<caption>&nbsp;</caption>
			<tr>
				<td width="205" height="166"><table width="100%" height="151"
						border="1">
						<tr>
							<td><img src="/sameekshak/adminImage" alt="" name="admin_image" width="195"
								height="200" align="middle" id="admin_image" />
							</td>
						</tr>
						<tr>
							<td><div align="center"><%=admin.getAdminId()%></div>
							</td>
						</tr>
					</table>
				</td>
				<td width="831"><div class="name_display" align="center">
						<table width="100%" height="217" border="1">
							<tr>
								<td height="70" colspan="4"><div align="center">SAMEEKSHAK</div>
								</td>
							</tr>
							<tr>
								<td height="70" colspan="3"><%=admin.getAdminName()%></td>
								<td width="23%"><div align="center"><a href="/sameekshak/adminLogout">Logout</a></div>
								</td>
							</tr>
							<tr>
								<td width="23%" height="67"><div align="center">
										<a href="javascript:setTestLinksBasedOnRoles(<%=roleValue%>)">TEST</a>
									</div>
								</td>
								<td width="27%"><div align="center">
										<a href="#">ASSIGNMENT</a>
									</div>
								</td>
								<td width="27%"><div align="center">
										<a href="javascript:setProfileLinksBasedOnRoles(<%=roleValue%>)">PROFILE</a>
									</div>
								</td>
								<td><div align="center">
										<a href="#">REPORT</a>
									</div>
								</td>
							</tr>
						</table>
					</div>
				</td>
				<td width="400">-</td>
			</tr>
			<tr>
				<td id="option1" height="40">-</td>
				<td rowspan="12" style="margin-top: 2px"><div id="changingPanel" style="height: 900px">
						Please select something from the left panel :) 
					</div>
				</td>
				<td rowspan="8">news</td>
			</tr>
			<tr>
				<td id="option2" height="40">-</td>
			</tr>
			<tr>
				<td id="option3" height="40">
				</td>
			</tr>
			<tr>
				<td id="option4" height="40">-</td>
			</tr>
			<tr>
				<td id="option5" height="40">-</td>
			</tr>
			<tr>
				<td id="option6" height="40">-</td>
			</tr>
			<tr>
				<td id="option7" height="40">-</td>
			</tr>
			<tr>
				<td height="40">-</td>
			</tr>
			<tr>
				<td height="40">&nbsp;</td>
				<td rowspan="4">events</td>
			</tr>
			<tr>
				<td height="40">&nbsp;</td>
			</tr>
			<tr>
				<td height="40">&nbsp;</td>
			</tr>
			<tr>
				<td height="40">&nbsp;</td>
			</tr>
		</table>
		<p>&nbsp;</p>
		<table width="100%" border="1">
			<tr>
				<td><div align="right">CDAC-LOGO</div>
				</td>
			</tr>
		</table>
		<p>&nbsp;</p>
	</div>

</body>
</html>