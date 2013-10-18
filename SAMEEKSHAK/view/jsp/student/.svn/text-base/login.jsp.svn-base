<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<script src="/sameekshak/view/js/jquery.js"></script>
<script type="text/javascript">
window.onload = function() {
	document.getElementById('fhide').style.display = "none";
}
function forgotPassword(){
	//alert("hi")
	var div = document.getElementById('fhide');
	   if (div.style.display == 'none') {
		   document.getElementById('fhide').style.display = "block";
	   }
	   else {
	     div.style.display = 'none';
	   }
}
$(document).ready(function() {
	$("#send").click(function() {
		
		var uname = $('#studentid').val();
		alert("send :" +uname);
		$('#studentid').val("");
		document.getElementById('fhide').style.display = "none";
		$.ajax({
			type: 'POST',
			url: '/sameekshak/forgotStudentPassword',
			data: 'username='+uname, 
			dataType: 'html', 
		}).done(function(msg) { 

			/* $('#changingPanel').load("/sameekshak/view/jsp/admin/profile/EditAdmin.jsp");
			//alert("after reschedule panel load load"); */
		});
	});
});



</script>
<div class="border">
	<form action="studentLogin" method="post">
		<%-- <table height="150" width="250">
			<tr>

				<td><font color="#4B8DF8">Username</font></td>
				<td><input size="15" name="username" id="username" type="text"></input>
				</td>
			</tr>
			<tr>
				<td><font color="#4B8DF8">Password</font></td>
				<td><input size="15" name="password" id="password"
					type="password"><input name="currentRequestSessionId" id="session"
					type="hidden" value="<%= session.getId() %>" >
				</td>
			</tr>
			<tr>
				<td><input accesskey="l" id="login_btn" " name="login"
					value="Login" type="submit"></input>
					
				</td>
			</tr>
		</table> --%>
		<pre>
function LoginPage()
{
//Students, Welcome to SAMEEKSHAK
//It provides a platform to compete with other techies...
//platform to explore the programming world in an interactive manner
//To continue further we need ur userName and password
&lt;form action = "hide" method = "get">
&lt;input type = "text" name = "ur<b>UserName</b>" value = "<input size="15" name="username" id="username" type="text" />">
&lt;input type = "password" name = "ur<b>Password</b>" value = "<input size="15" name="password" id="password" type="password" />">
&lt;br />
&lt;input type = "button" name = "loginButton" value = "<input accesskey="l" id="login_btn" " name="login"value="Login" type="submit">">

}
</pre>
<input name="currentRequestSessionId" id="session"
					type="hidden" value="<%= session.getId() %>" >
	</form>
	<!-- <form action="" method="post"> -->
	<a href="javascript:forgotPassword()">Forgot Password</a>
	<div id="fhide">Enter your student id :<input type="text" id="studentid" name="studentid" />
	<input type="button" value="OK" id="send" name="send" /> 
	</div>
	<!-- </form> -->
</div>