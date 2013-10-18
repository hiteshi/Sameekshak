<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.cdac.sameekshak.entities.Test"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%! int trial = 23; %>
<%
	List<Test> populatedTest = (List<Test>) session.getAttribute("populatedTest");
%>
<script src="/sameekshak/view/js/jquery.min.js"></script>
<script src="/sameekshak/view/js/jquery-ui.min.js"></script>
<link href="/sameekshak/view/css/jquery-ui.css" rel="stylesheet" type="text/css" />
<script>
	$(document).ready(function() {
	  
		$( "#scheduledDate" ).datepicker({dateFormat: 'yy-mm-dd', yearRange: "1950:2025", showAnim: 'fold', showOptions: {showSpeed:'0'},  changeMonth:true,changeYear:true});
			
	});
</script>
<div id="changingPanel"	style="height: 900px"> 


	<table width="100%" border="1px" bordercolor="red">
		<tr>
			<td width="40%">
				
				<%
						for (int i = 0; i < populatedTest.size(); i++) { 
					%>  
					
					<input id="<%=populatedTest.get(i).getTestId()%>" type="radio"
					name="3p"
					onchange="radiosel(<%=populatedTest.get(i).getTestId()%>)">	<%=populatedTest.get(i).getName()%>&nbsp;
											<%= (populatedTest.get(i).getScheduledDate()).toString() %>&nbsp;
											<%=populatedTest.get(i).getScheduledTime()%>&nbsp;
											<br>

					<%	} 
					%> 
				
				
				
			</td>
			<td width="60%">
			
			<form action="rescheduleTest" method="post">
		<table id="testDetailsBar" height="150" width="100%" border="2px">
			<tr>
				<td><font color="#4B8DF8">Test ID</font></td>
				<td><input size="15" name="testId" id="testId" type="text" readonly="readonly"></input>
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Test Name</font></td>
				<td><input size="15" name="testName" id="testName" type="text"></input>
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Date</font></td>
				<td><input size="15" name="scheduledDate" id="scheduledDate"
					type="text">
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Time</font></td>
				<td><input size="15" name="scheduledTime" id="scheduledTime"
					type="text">
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Duration</font></td>
				<td><input size="15" name="testDuration" id="testDuration"
					type="text">
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Remarks</font></td>
				<td><textarea name="testRemarks" cols="35" rows="10"
								id="testRemarks" style="resize: none"></textarea>
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Scheduled by</font></td>
				<td><input size="15" name="scheduledBy" id="scheduledBy"
					type="text">
				</td>
			</tr>
						
			<tr>
				<td><input id="scheduleTestButton" name="scheduleTestButton"
					value="Go" type="submit"></input>
					
				</td>
			</tr>
		</table>
	</form>
		
			</td>
		</tr>
	
	
	</table>
	


</div>