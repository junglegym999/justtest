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
</head>
<body>
	<script type="text/javascript">
		if (window.name == "update") {
			window.opener.parent.location.href = "BoardServlet?command=board_update_form&num=${param.num}";
		} else if (window.name == 'delete') {
			alert('It is deleted');
			window.opener.parent.location.href = "BoardServlet?command=board_delete&num=${param.num}";
		}
		window.close();
	</script>
</body>
</html>