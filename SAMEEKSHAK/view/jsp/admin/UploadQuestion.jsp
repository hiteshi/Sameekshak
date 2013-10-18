<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.cdac.sameekshak.entities.Test"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script src="/sameekshak/view/js/jquery.min.js"></script>
<script src="/sameekshak/view/js/jquery-ui.min.js"></script>
<script type="text/javascript">
	var noOfInput = 1;
	var inputOpt=1;
	function makeInput(identity) {

		var table = document.getElementById('abc');
		var body = table.getElementsByTagName('tbody')[0];
		var tr = document.createElement('tr');
		var td = document.createElement('td');
		var td1 = document.createElement('td');
		var input = document.createElement('input');
		var td2 = document.createElement('td');
		var td3 = document.createElement('td');

		input.setAttribute('type', 'file');

		input.setAttribute('id', identity);
		input.setAttribute('name', identity);
		input.setAttribute('size', '30');

		td1.setAttribute('align', 'center');
		td1.innerHTML = identity;

		td.appendChild(input);
		tr.appendChild(td1);

		tr.appendChild(td);
		if (inputOpt==1) {
			
			var radio1 = document.createElement('input');
			radio1.setAttribute('type', 'radio');
			var type='type'+noOfInput;
			radio1.setAttribute('name', type);
			radio1.setAttribute('checked', 'checked');
			radio1.setAttribute('id', type);
			radio1.setAttribute('value', 'sample');
			td2.innerHTML = 'sample';
			var radio2 = document.createElement('input');
			radio2.setAttribute('type', 'radio');
			radio2.setAttribute('name', type);
			radio2.setAttribute('id', type);
			radio2.setAttribute('value', 'evaluation');
			td3.innerHTML = 'evaluation';
			td2.appendChild(radio1);
			td3.appendChild(radio2);
			tr.appendChild(td2);
			tr.appendChild(td3);

		}
		else{
			
		}

		body.appendChild(tr);

	}
	$(document).ready(function() {

		$("#add").click(function() {
			if (noOfInput < 10) {
				noOfInput = noOfInput + 1;

				var identity = "Input" + noOfInput;
				inputOpt=1;
				makeInput(identity);

				identity = "Output" + noOfInput;
				inputOpt=0;
				makeInput(identity);
				$('#nofInput').val(noOfInput);
			} else {
				alert("only 10 input files are possible");
			}
		});

	});
</script>
<%
	List<Test> populatedTest = (List<Test>) session
			.getAttribute("populatedTest");
%>
<form action="uploadQuestion" method="post"
	enctype="multipart/form-data">
	<table height="150" border="1px">
		<tr>
			<td align="center" colspan="3">Select Test</td>
			<td><select id="testDetails" name="testDetails">
					<%
						for (int i = 0; i < populatedTest.size(); i++) {
					%>
					<option value="<%=populatedTest.get(i).getTestId()%>" id="<%=i%>" >
						<%=populatedTest.get(i).getName()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Date
						:&nbsp;
						<%=populatedTest.get(i).getScheduledDate()%>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Time
						:&nbsp;
						<%=populatedTest.get(i).getScheduledTime()%></option>
					<%
						}
					%>
			</select></td>
		</tr>
		<tr>
			<td align="center" colspan="3">Question paper</td>
			<td><input type="file" id="QuesPdfUpload" name="pdfUpload"
				size="40" />
			</td>
		</tr>
		<tr>
			<td align="center" colspan="3">Duration of Reading</td>
			<td><input type="text" size="4" maxlength="2"
				id="readingDuration" name="readingDuration" />min</td>
		</tr>
		<tr>
			<td align="center" colspan="3">Evaluation Time</td>
			<td><input type="text" size="4" maxlength="2" id="evalTime"
				name="evalTime" />sec</td>
		</tr>
	</table>
	<table id="abc" border="1px">
		<tr>
			<td align="center" width="20px">Input1</td>
			<td><input type="file" id="Input1" name="Input1" size="30" />
			</td>
			<td>sample<input type="radio" id="type1" name="type1" checked="checked" value="sample"></input></td>
			<td>evaluation<input type="radio" id="type1" name="type1" value="evaluation"></input></td>
			
		</tr>
		<tr>
			<td align="center">Output1</td>
			<td><input type="file" id="Output1" name="Output1" size="30" />
			</td>
			<td> <input type="button" id="remove" name="remove" value="remove"/></td>
		</tr>
	</table>
	<table border="1px">
		<tr>
			<td><input type="button" id="add" value="Add More..." name="add"
				size="25" /></td>

		</tr>


		<tr>

			<td><input type="submit" id="Upload" value="Upload"
				name="Upload" />
			</td>
		</tr>
	</table>
	
</form>