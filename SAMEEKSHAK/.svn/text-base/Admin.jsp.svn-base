<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>


<!--META-->
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>Sameekshak</title>
<!--STYLESHEETS-->
<link href="view/css/style.css" rel="stylesheet" type="text/css" />

<!--SCRIPTS-->
<script src="view/js/ga.js" async="" type="text/javascript"></script>
<script type="text/javascript" src="view/js/jquery.js"></script>
<!--Slider-in icons-->
<script type="text/javascript">
	$(document).ready(function() {
		$(".username").focus(function() {
			$(".user-icon").css("left", "-48px");
		});
		$(".username").blur(function() {
			$(".user-icon").css("left", "0px");
		});

		$(".password").focus(function() {
			$(".pass-icon").css("left", "-48px");
		});
		$(".password").blur(function() {
			$(".pass-icon").css("left", "0px");
		});
	});
</script>
<!--Google Analytics-->
<script type="text/javascript">
	var _gaq = _gaq || [];
	_gaq.push([ '_setAccount', 'UA-28197767-1' ]);
	_gaq.push([ '_trackPageview' ]);

	(function() {
		var ga = document.createElement('script');
		ga.type = 'text/javascript';
		ga.async = true;
		ga.src = ('https:' == document.location.protocol ? 'https://ssl'
				: 'http://www')
				+ '.google-analytics.com/ga.js';
		var s = document.getElementsByTagName('script')[0];
		s.parentNode.insertBefore(ga, s);
	})();
</script>
</head>
<body>
	<br />
	<br />
	<br />
	<font color="#FF5CB8" style=""><h1 align="center">SameekshaK</h1>
	</font>

<!-- 	WRAPPER -->
	<div id="wrapper">

<!-- 		SLIDE-IN ICONS -->
		<div class="user-icon"></div>
		<div class="pass-icon"></div>
<!-- 		END SLIDE-IN ICONS -->

<!-- 		LOGIN FORM -->
		<form name="login-form" class="login-form" action="adminLogin"
			method="post">

<!-- 			HEADER -->
			<div class="header">
<!-- 				TITLE -->
				<h1>Admin Login</h1>
<!-- 				END TITLE -->
<!-- 				DESCRIPTION -->
				<span>Enter the user name and password below to login to
					Sameekshak.</span>
<!-- 				END DESCRIPTION -->
			</div>
<!-- 			END HEADER -->

<!-- 			CONTENT -->
			<div class="content">
<!-- 				USERNAME -->
				<input name="username" class="input username" value="Username"
					onfocus="this.value=''" type="text" />
					
					<input name="currentRequestSessionId"  value="<%= session.getId() %>"
					 type="hidden" />
<!-- 				END USERNAME -->
<!-- 				PASSWORD -->
				<input name="password" class="input password" value="Password"
					onfocus="this.value=''" type="password" />
<!-- 				END PASSWORD -->
			</div>
<!-- 			END CONTENT -->

<!-- 			FOOTER -->
			<div class="footer">
<!-- 				LOGIN BUTTON -->
				<input name="submit" value="Login" class="button" type="submit" />
<!-- 				END LOGIN BUTTON -->
			</div>
<!-- 			END FOOTER -->

		</form>
<!-- 		END LOGIN FORM -->
	</div>
</body>
</html>