<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@page import="com.cdac.sameekshak.entities.Test"%>
<%@page import="java.util.*"%>
<%@page import="com.cdac.sameekshak.entities.Question"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>

</head>
<body>

	<%
		Test test = (Test) getServletContext().getAttribute("test");
		List<Question> questions = (List<Question>) getServletContext().getAttribute("questionList");

		System.out
				.println("inside InstuctionMenu.jsp testId dekna hai.........."
						+ test.getTestId());
		for (int i = 0; i < questions.size(); i++) {
			System.out
					.println("inside InstuctionMenu.jsp question dekna hai......."
							+ i + " =  " + questions.get(i).getQuestionId());
		}
	%>
	Instructions......
	<br>
	<ul>
		<li>Instruction 1</li>

		<li>Instruction 1</li>
		<li>Instruction 1</li>
		<li>Instruction 1</li>
		<li>Instruction 1</li>
	</ul>
	<form action="/sameekshak/InstructionMenu" method="post">
		Select Question
		<%
		if (questions != null) {
			for (int i = 0; i < questions.size(); i++) {
	%>

		<input id="questionId" type="radio" name="questionId"
			value="<%=questions.get(i).getQuestionId()%>" selected="selected"/><%=questions.get(i).getQuestionId()%> <br>

		<%
			}
			}
		%>
<br>		
	
		<input type="submit" value="Question">
	</form>
</body>
</html>