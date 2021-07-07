<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table align="center">
		<tr>
			<td>
				<h1>Hi.</h1>
			</td>
		</tr>
		<tr>
			<td><input type="button" value="BOARD"
				onclick="location.href='BoardServlet?command=board_list'"> <input
				type="button" value="LOGIN" onclick="location.href='login.do'">
			</td>
		</tr>
	</table>
	<!-- 	<a href="login.do">Go to login</a> -->
</body>
</html>