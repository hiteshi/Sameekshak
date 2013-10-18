<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.cdac.sameekshak.entities.Administrator"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<!-- we will replace the changing panel by dynamically loading the correct page using jquery -->
<script src="/sameekshak/view/js/jquery.min.js"></script>
<script src="/sameekshak/view/js/jquery-ui.min.js"></script>
<link href="/sameekshak/view/css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script>
	$(document).ready(function() {
	  
		$( "#scheduledDate" ).datepicker({dateFormat: 'yy-mm-dd', yearRange: "1950:2025", showAnim: 'fold', showOptions: {showSpeed:'0'},  changeMonth:true,changeYear:true});
			
	});
</script>
<%
	List<Administrator> adminList = (List<Administrator>) session
			.getAttribute("adminList");
%>
<div id="changingPanel"	style="height: 900px"> 

	<form action="scheduleNewTest" method="post">
		<table height="150" width="100%" border="2px">
			<tr>

				<td><font color="#4B8DF8">Test Name</font></td>
				<td><input size="15" name="testName" id="testName" type="text"></input>
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Date</font></td>
				<td><input size="15" name="scheduledDate" id="scheduledDate"
					type="text" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Time</font></td>
				<td><input size="15" name="scheduledTime" id="scheduledTime"
					type="text">(hh:mm:ss)
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Duration</font></td>
				<td><input size="15" name="testDuration" id="testDuration"
					type="text">min
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Remarks</font></td>
				<td><textarea name="testRemarks" cols="35" rows="10"
								id="testRemarks" style="resize: none"></textarea>
				</td>
			</tr>
<!-- 			<tr>
				<td><font color="#4B8DF8">Scheduled by</font></td>
				<td><input size="15" name="scheduledBy" id="scheduledBy"
					type="text">
				</td>
			</tr> -->
			<tr>
				<td><font color="#4B8DF8">Conducted by</font></td>
				<td><!-- <input size="15" name="conductedBy" id="conductedBy"
					type="text"> -->
					<select id="conductedBy" name="conductedBy" style="width: 250px" >
					<%for (int i = 0; i < adminList.size(); i++) { %>
					<option value="<%=adminList.get(i).getAdminName()%>" id="<%=adminList.get(i).getAdminId()%>">
						<%=adminList.get(i).getAdminName()%>
					</option>
					<%
						}
					%>
					
					</select>
				</td>
			</tr>
						
			<tr>
				<td><input id="scheduleTestButton" name="scheduleTestButton"
					value="Go" type="submit"></input>
					
				</td>
			</tr>
		</table>
	</form>

	





</div>


