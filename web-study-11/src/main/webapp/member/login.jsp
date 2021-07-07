<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="script/member.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<h2 align="center" heigh="50">Log-in</h2>
	<form action="login.do" method="post" name="frm">
		<table align="center">
			<tr>
				<td>
					<div class="input-group mb-3">
						<span class="input-group-text" id="basic-addon1">I D : </span> <input
							type="text" class="form-control" placeholder="UserID"
							name="userid" size="20" aria-label="UsernID"
							aria-describedby="basic-addon1">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<div class="input-group mb-3">
						<span class="input-group-text" id="basic-addon1">PWD : </span> <input
							type="password" class="form-control" placeholder="UserPassword"
							name="pwd" size="20" aria-label="UserPassword"
							aria-describedby="basic-addon1">
					</div>
				</td>
			</tr>
			<tr>
				<td>
					<button type="submit" class="btn btn-primary"
						onclick="return loginCheck()">Login</button>
					<button type="reset" class="btn btn-primary">Cancel</button>
					<button type="button" class="btn btn-primary"
						onclick="location.href='join.do'">Regist</button>
				</td>
			</tr>
			<tr>
				<%-- 				<td colspan="2">${message}</td> --%>
			</tr>
			<tr>
				<td><a id="custom-login-btn" type="submit"> <img
						src="//k.kakaocdn.net/14/dn/btqCn0WEmI3/nijroPfbpCa4at5EIsjyf0/o.jpg"
						width="222" onclick="return loginCheck()" />
				</a></td>
			</tr>
		</table>

		<div class="alert alert-success" role="alert">
			<h4 class="alert-heading">Well done!</h4>
			<p>
				<td colspan="2">${message}</td> --%>
			</p>
			<hr>
			<p class="mb-0">Whenever you need to, be sure to use margin
				utilities to keep things nice and tidy.</p>
		</div>
		Kakao.Navi.share({ name: "현대백화점 판교점", x: 127.11205203011632, y:
		37.39279717586919, coordType: 'wgs84' }); <a id="navi" href="#"
			onclick="navi();"> <img
			src="https://developers.kakao.com/assets/img/about/buttons/navi/kakaonavi_btn_medium.png" />
		</a>
		<script type="text/javascript">
			function navi() {
				Kakao.Navi.start({
					name : '현대백화점 판교점',
					x : 127.11205203011632,
					y : 37.39279717586919,
					coordType : 'wgs84',
				})
			}
		</script>
	</form>
</body>
</html>
