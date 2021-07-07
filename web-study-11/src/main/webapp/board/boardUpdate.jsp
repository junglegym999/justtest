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
	<div id="wrap" align="center"></div>
	<h1>게시글 수정</h1>
	<form name="frm" method="post" action="BoardServlet">
		<input type="hidden" name="command" value="board_update"> <input
			type="hidden" name="num" value="${board.num}">
		<table>
			<tr>
				<th>Writer</th>
				<td><input type="text" size="12" name="name"
					value="${board.name}"> *필수</td>
			</tr>
			<tr>
				<th>Password</th>
				<td><input type="Password" size="12" name="pass"
					value="${board.name}"> *필수(You need it when Deleting)</td>
			</tr>
			<tr>
				<th>Email</th>
				<td><input type="text" size="40" maxlength="50" name="email"
					value="${board.email}"> *필수</td>
			</tr>
			<tr>
				<th>Title</th>
				<td><input type="text" size="70" name="title"
					value="${board.title}"></td>
			</tr>
			<tr>
				<th>Content</th>
				<td><textarea cols="70" rows="15" name="content">${board.content}</textarea></td>
			</tr>
		</table>
		<br> <br> <input type="submit" value="Update"
			onclick="return boardCheck()"> <input type="reset"
			value="reWrite"> <input type="button" value="list"
			onclick="location.href='BoardServlet?command=board_list'">

	</form>
</body>
</html>