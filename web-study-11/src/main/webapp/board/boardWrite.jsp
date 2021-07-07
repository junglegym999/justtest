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
		<h1>게시글 등록</h1>
		<form name="frm" method="post" action="BoardServlet">
			<input type="hidden" name="command" value="board_write">
			<table>
				<tr>
					<th>Writer</th>
					<td><input type="text" name="name">*필수</td>
				</tr>
				<tr>
					<th>Password</th>
					<td><input type="password" name="pass"> *필수(게시글 삭제시
						필요)</td>
				</tr>
				<tr>
					<th>Email</th>
					<td><input type="text" name="email"></td>
				</tr>
				<tr>
					<th>Title</th>
					<td><input type="text" size="70" name="title">*필수</td>
				</tr>
				<tr>
					<th>Content</th>
					<td><textarea cols="70" rows="15" name="content"></textarea></td>
				</tr>
			</table>
			<br> <br> <input type="submit" value="regist"
				onclick="return boardCheck()"> 
				<input type="reset"
				value="rewrite"> <input type="button" value="list"
				onclick="location.href='BoardServlet?command=board_list'">
		</form>
	</div>
</body>
</html>