<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/shopping.css">
<script type="text/javascript" src="script/board.js"></script>
</head>
<body>
	<div id="wrap" align="center">
		<h1>게시글 상세보기</h1>
		<table>
			<tr>
				<th>Wrtier</th>
				<td>${board.name }</td>
				<th>Email</th>
				<td>${board.email}</td>
			</tr>
			<tr>
				<th>WrittenDate</th>
				<td><fmt:formatDate value="${board.writedate}"></fmt:formatDate></td>
			</tr>
			<tr>
				<th>readcount</th>
				<td>${board.readcount}</td>
			</tr>

			<tr>
				<th>Title</th>
				<td colspan="3">${board.title}</td>
			</tr>
			<tr>
				<th>Content</th>
				<td colspan="3"><pre>${board.content}</pre></td>
			</tr>
		</table>


		<br> <br> <input type="button" value="Modify"
			onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}','update')">
		<input type="button" value="Delete"
			onclick="open_win('BoardServlet?command=board_check_pass_form&num=${board.num}','delete')">
		<input type="button" value="List"
			onclick="location.href='BoardServlet?command=board_list'"> <input
			type="button" value="Write"
			onclick="location.href='BoardServlet?command=board_write_form'">
	</div>
</body>
</html>