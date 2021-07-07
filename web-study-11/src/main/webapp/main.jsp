<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${empty loginUser}">
	<jsp:forward page='login.do' />
</c:if>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 관리</title>
<style type="text/css">
.mask {
	z-index: 10005;
	position: fixed;
	top: 0;
	left: 0;
	bottom: 0;
	right: 0;
	background: rgba(0, 0, 0, 0.5);
}

.layer-pop {
	z-index: 10006;
	overflow: hidden;
	position: absolute;
	top: 0;
	left: 5%;
	width: 90%;
}

.layer-pop .btn-close {
	position: absolute;
	top: 0;
	right: 0;
	border: none;
	background: none;
	outline: none;
	cursor: pointer;
}

.layer-pop .alt-txt {
	position: absolute;
	top: -9999999%;
	left: -9999999%;
	width: 0;
	height: 0;
	font-size: 0;
	text-indent: -9999999%;
}

.layer-pop#popup01 {
	top: 25%;
}

.layer-pop a {
	display: block;
	cursor: pointer;
}

.layer-pop map area {
	outline: none;
}

.layer-pop .img-wrap {
	border: 3px #f37321 solid;
	border-bottom: 0;
}

.layer-pop .img-wrap img {
	width: 100%;
	vertical-align: top; /*cursor:pointer;*/
}

.layer-pop .txt-alt {
	position: absolute;
	top: -99999999%;
	left: -99999999%;
	width: 0;
	height: 0;
	text-indent: -9999999%;
	font-size: 0;
}

.layer-pop .pop-footer {
	padding-right: 13px;
	height: 30px;
	text-align: right;
	color: #fff;
	background-color: #f37321;
}

.layer-pop .pop-footer * {
	vertical-align: middle;
}

.layer-pop .pop-footer input {
	appearance: checkbox !important;
	-webkit-appearance: checkbox !important;
	margin-right: 7px;
	vertical-align: middle;
}

.layer-pop .pop-footer label {
	margin-right: 7px;
	line-height: 30px;
	font-size: 13px;
}

.layer-pop .pop-footer .btn_close_s {
	font-size: 17px;
	cursor: pointer;
}

@media screen and (min-width:550px) {
	.layer-pop#popup01 {
		top: 50%;
		left: 50%;
		margin-top: -150px;
		margin-left: -155px;
		width: 310px;
	}
}
</style>
<script type="text/javascript" src="script/member.js"></script>
</head>
<body>
	<div class="header_mask"></div>
	<h2 align="center">회원 전용 페이지</h2>
	<form action="logout.do">
		<table align="center">
			<tr>
				<td>안녕 ${loginUser.name}(${loginUser.userid})님</td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="logout">&nbsp;&nbsp; <input type="button"
					value="회원정보변경"
					onclick="location.href='memberUpdate.do?userid=${loginUser.userid}'"></td>
			</tr>
		</table>
	</form>
</body>
</html>