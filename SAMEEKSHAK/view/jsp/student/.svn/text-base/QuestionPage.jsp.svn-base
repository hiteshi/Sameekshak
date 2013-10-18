<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="java.io.*"%>

<%@page import="com.cdac.sameekshak.entities.Question"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script type="text/javascript" src="/sameekshak/view/js/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

<script type="text/javascript">
window.onload=clock();
var strTime;

function clock() {
	//alert("...............................Question1 Page started.......");
	   var now = new Date();
	   strTime = now.getHours()+':'+now.getMinutes()+':'+now.getSeconds();
	   //document.getElementById('clockDiv').innerHTML=outStr;
	  // alert("hello anshul,.......................");
	   Tick();	}

function Tick()
{
	
	var fileName=$("#fileName").val();

	var codeType=$("#code_type").val();
	$.ajax({
		type: 'POST',
		url: 'QuestionTimer',
		data: 'cmd='+strTime+"&fileName="+fileName+"&codeType="+codeType, 
		dataType: 'html', 
	}).done(function(msg) {
// 		alert("time left : "+msg);
		
		if(msg=="TimeOut"){
			//alert("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa = "+msg);
 			document.getElementById("clockDiv").innerHTML = "<a href=\"view/jsp/student/testPage.jsp\">Code</a>";
		}
		else{
			//alert("--"+msg+"--")
			document.getElementById("clockDiv").innerHTML = "time left : "+msg;
			setTimeout("Tick()", 1000);
		}
		
		
	});
	
	
}
</script>

</head>
<body>
	<table border="1">
		<tr>


			<td><iframe src=/sameekshak/viewPdfQus
					style="width: 818px; height: 830px;" frameborder="0"></iframe></td>
			<td>
				<div id="clockDiv"></div>
				<input id="code_type" type="radio" name="code_type" value="c" />C <input id="code_type" type="radio" name="code_type" value="java" checked/>JAVA <br>
				<td>File Name : <input type="text" id="fileName" name="fileName" />
			</td>
		</tr>
		
	</table>

</body>
</html>