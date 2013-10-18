<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.cdac.sameekshak.entities.Test"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script type="text/javascript" src="/sameekshak/view/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	var testId=0000;
	$('#testDetails').change(function() {
		
		testId=$(this).find('option:selected').attr('id');
		
		$.ajax({
			type: 'POST',
			url: 'controlTestSessionDetails',
			data: "cmd=FetchData"+'&testId='+testId,
			dataType: 'html', 
		}).done(function(msg) { 

			$("#testDetailsTable").html(msg);
		}); 
	});
	
	$('#startButton').click(function(){
		alert("test id="+testId);
		$.ajax({
			type: 'POST',
			url: 'startTest',
			data: "cmd=FetchData"+'&testId='+testId,
			dataType: 'html', 
		}).done(function(msg) { 
			if(msg.equals("true")){
				alert("after reschedule panel load load");
				$('#changingPanel').load("/sameekshak/view/jsp/admin/ongoing.jsp");
			}
			else
				{
					alert("start test only after scheduled time");
				}
		}); 
		alert("clicked start");
	});
	
});
</script>
<%
	List<Test> populatedTest = (List<Test>) session.getAttribute("populatedTest");
%>

<div id="changingPanel" style="height: 900px">

	<table id="testDetailsBar" height="150" width="100%" border="2px">
		<tr>
			<td align="center"><select id="testDetails" multiple="multiple"
				size="5">
					<%
						for (int i = 0; i < populatedTest.size(); i++) {
					%>
					<option value="<%=populatedTest.get(i).getTestId()%>"
						id="<%=populatedTest.get(i).getTestId()%>">
						<%=populatedTest.get(i).getName()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Date
						:&nbsp;
						<%=populatedTest.get(i).getScheduledDate()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time
						:&nbsp;
						<%=populatedTest.get(i).getScheduledTime()%></option>
					<%
						}
					%>
			</select>
			</td>
		</tr>
		<tr>
			<td align="center"><div id="testDetailsTable"></div>
			</td>
		</tr>
		<tr>
		
			<td align="center"><input type="button" id="startButton" name="startButton" value="StartTest"/></td>
		</tr>
	</table>



</div>