<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.cdac.sameekshak.entities.Student"%>
<%@page import="com.cdac.sameekshak.entities.Test"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<script type="text/javascript">
$(function() {
    $("#enrollYear").change(function() {
       var value=$(this).val() // how to get the value of the selected item if you need it
       if(value!="Select Year"){
       		alert("year = "+value);
       		
       		
       		$.ajax({
       			type: 'POST',
       			url: 'getStudentList',
       			data: 'cmd='+value, 
       			dataType: 'html', 
       		}).done(function(msg) {
       			$("#StudentTable").html(msg);
       		});
       }
    });
});
</script>
<%
	List<Student> studentList = (List<Student>) session
			.getAttribute("studentList");
	int year = 2011;

	List<Test> populatedTest = (List<Test>) session
			.getAttribute("populatedTest");
%>
<form action="/sameekshak/getEligibleStudentList" method="post">
	<div class="container1" align="center">
		<br /> <br />
		<div
			style="border: 2px; border-style: solid; border-color: blue; border-radius: 15px;">
			Select Eligible Student :<br /> <br /> <br />
			<table border="1">
				<tr>
					<td><select style="width: 150px" onchange="setYear()"
						name="enrollYear" id="enrollYear">
							<option>Select Year</option>
							<option>2011</option>
							<option>2012</option>
					</select></td>
				</tr>
				<tr>
					<td><select id="testDetails" name="testDetails">
							<%
								for (int i = 0; i < populatedTest.size(); i++) {
							%>
							<option value="<%=populatedTest.get(i).getTestId()%>" id="<%=i%>">
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
					<td><div id="StudentTable"></div>
						</td>
				</tr>
			</table>
		</div>
		<br /> <br /> <input type="submit" value="Submit" />
	</div>

</form>
