<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
<script type="text/javascript" src="script/member.js">
	
</script>
</head>
<body>
	<h2 align="center">회원 수정</h2>
	<form action="memberUpdate.do" method="post" name="frm"></form>
	<table align="center">
		<tr>
			<td>name</td>
			<td><input type="text" name="name" size="20" value="${vo.name}"
				readonly>
		</tr>
		<tr>
			<td>ID</td>
			<td><input type="text" name="userid" size="20"
				value="${vo.userid}" readonly></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><input type="password" name="pwd" size="20">*</td>
		</tr>
		<tr height="30">
			<td width>Confirm</td>
			<td><input type="password" name="pwd_check" size="20">*</td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" size="20"
				value="${vo.email}"></td>
		</tr>
		<tr>
			<td>Phoneumber</td>
			<td><input type="text" name="phone" size="20"
				value="${vo.phone}"></td>
		</tr>
		<tr>
			<td>Authority</td>
			<td><c:choose>
					<c:when test="${vo.admin==0}">
						<input type="radio" name="admin" value="0" checked="checked">End-User
		<input type="radio" name="admin" value="1">Manager
		</c:when>
					<c:otherwise>
						<input type="radio" name="admin" value="0">End-User
		<input type="radio" name="admin" value="0" checked="checked">Manager
		</c:otherwise>
				</c:choose></td>
		</tr>
		<tr>
			<td colspan="2" align="center"><input type="submit"
				value="Submit" onclick="return joinCheck()">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset"
				value="Cancel"></td>
		</tr>

	</table>
</body>
</html>